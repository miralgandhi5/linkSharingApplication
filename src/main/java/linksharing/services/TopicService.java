package linksharing.services;

import linksharing.Dao.Impl.TopicDao;
import linksharing.Dao.Impl.UserDao;
import linksharing.entities.Subscriptions;
import linksharing.entities.Topic;
import linksharing.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by miral on 7/18/2017.
 */
@Service
public class TopicService {

    @Autowired
    TopicDao topicDao;
    @Autowired
    UserDao userDao;
    @Autowired
    SubscriptionService subscriptionService;

    public String createTopic(Topic topic, Integer userId){
        System.out.println("save");
        String msg="topic added";
        topic.setCreatedBy(userDao.get(userId));
        Topic topic1=topicDao.save(topic);
        if(topic1==null)
            msg="not saved";
        else {
            System.out.println(topic1);
            subscriptionService.createSubscriber(topic,userId);

        }
        return msg;
    }

    public List<Subscriptions> getTopicList(HttpServletRequest request){
        List<Subscriptions> topicList=null;

        HttpSession session=request.getSession(false);
        System.out.println(session+"session inlist");
        User user=(User)session.getAttribute("User");
        topicList=topicDao.findByUser(user);
        return  topicList;
    }

}
