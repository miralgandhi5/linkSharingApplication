package linksharing.controller;

import linksharing.Dao.Impl.TopicDao;
import linksharing.Dao.Impl.UserDao;
import linksharing.entities.Subscriptions;
import linksharing.entities.Topic;
import linksharing.services.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by miral on 7/16/2017.
 */

@Controller
@RequestMapping("/dashboard")
public class TopicController {

    @Autowired
    TopicDao topicDao;
    @Autowired
    UserDao userDao;
    @Autowired
    TopicService topicService;

    @RequestMapping(value = "/createTopic", method = RequestMethod.POST)
    @ResponseBody
    String createTopic(Topic topic, Integer userId) {

        return topicService.createTopic(topic,userId);

    }

    @RequestMapping(value = "/getTopicList",method = RequestMethod.GET)
    @ResponseBody
    List<Subscriptions> getTopicList(HttpServletRequest request){
        System.out.println("i am in request");
        return topicService.getTopicList(request);
    }
    @RequestMapping(value = "/checkName", method = RequestMethod.POST)
    @ResponseBody
    Boolean checkName(String name,Integer id){

        System.out.println("here");
        return topicDao.checkName(name,userDao.get(id));
    }

  @RequestMapping(value = "/getPublicTopics",method=RequestMethod.POST)
    @ResponseBody
    List<Topic> getPublicTopics(String name){
        return topicDao.findByVisibilityAndTopic(Topic.visibility.valueOf("Public"),name);
  }
}
