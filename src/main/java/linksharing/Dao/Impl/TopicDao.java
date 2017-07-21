package linksharing.Dao.Impl;

import linksharing.Main;
import linksharing.entities.Subscriptions;
import linksharing.entities.Topic;
import linksharing.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.Query;
import java.util.List;

/**
 * Created by miral on 7/16/2017.
 */
@Component
public class TopicDao extends BaseDao<Topic> {

    @Autowired
    Main Main;

    public TopicDao() {
        super(Topic.class);
    }


    public List<Topic> findByOwner(User user) {
        Query query= Main.getSession().createQuery( "from Topic where createdBy=:owner");

        query.setParameter("owner", user);

        List<Topic> topicList = query.getResultList();
        return topicList;
    }


    public List<Topic> findByVisibility(Topic.visibility visibility) {
        Query query= Main.getSession().createQuery( "from Topic where visible=:visibility");

        query.setParameter("visibility", visibility);

        List<Topic> topicList = query.getResultList();
        return topicList;
    }
    public List<Topic> findByVisibilityAndTopic(Topic.visibility visibility,String name) {
        Query query= Main.getSession().createQuery( "select name from Topic where name like :topicName and visible=:visibility");
        query.setParameter("topicName",name+"%");
        query.setParameter("visibility", visibility);

        List<Topic> topicList = query.getResultList();
        return topicList;
    }

    public List<Subscriptions> findByUser(User user) {
        System.out.println("user topic list");
        System.out.println(Main.getSession());
        Query query= Main.getSession().createQuery( " from Subscriptions where user=:user");

        query.setParameter("user", user);
        System.out.println(user);
        List<Subscriptions> subscriptionsList = query.getResultList();

        System.out.println(subscriptionsList);
        return subscriptionsList;
    }

    public List<Topic> findByVisibilityAndName(Topic.visibility visibility,String name) {
        Query query= Main.getSession().createQuery( "from Topic where visible=: and name=:name");
         query.setParameter("name",name);
        query.setParameter("visibility", visibility);

        List<Topic> topicList = query.getResultList();
        return topicList;
    }

    public Boolean checkName(String name,User user){
        Query query = Main.getSession().createQuery("from Topic where name=:name and user=:user");
        query.setParameter("user",user);
        query.setParameter("name",name);
        Topic result=(Topic)query.getSingleResult();
        System.out.println("result"+result);
        if(result!=null)
            return true;
        return false;

    }
}
