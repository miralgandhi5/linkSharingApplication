package linksharing.services;

import linksharing.Dao.Impl.SubscriptionDao;
import linksharing.Dao.Impl.UserDao;
import linksharing.entities.Subscriptions;
import linksharing.entities.Topic;
import linksharing.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by miral on 7/18/2017.
 */
@Service
public class SubscriptionService {
@Autowired
SubscriptionDao subscriptionDao;
@Autowired
    UserDao userDao;
    public Subscriptions createSubscriber(Topic topic, Integer userId){
        System.out.println("i am here");
        Subscriptions subscriptions1=null;
        Subscriptions subscriptions=new Subscriptions();
        subscriptions.setTopic(topic);
        Subscriptions.Seriousness seriousness=Subscriptions.Seriousness.valueOf("VerySerious");
        subscriptions.setSeriousness(seriousness);
        subscriptions.setUser(userDao.get(userId));

        System.out.println(subscriptions);
        subscriptions1=subscriptionDao.save(subscriptions);
        return subscriptions1;

    }

   public Subscriptions getSubscriber(User user,Topic topic){
        Subscriptions subscriptions=null;
        subscriptions=subscriptionDao.findSubscriber(topic,user);
        return  subscriptions;
    }
}
