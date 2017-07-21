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
 * Created by miral on 7/17/2017.
 */
@Component
public class SubscriptionDao extends BaseDao<Subscriptions> {
    @Autowired
    Main Main;
    public SubscriptionDao(){
        super(Subscriptions.class);
    }

    public List<Subscriptions> findByTopic(Topic topic) {
        Query query= Main.getSession().createQuery( "from Subscriptions where topic=:topic");

        query.setParameter("topic", topic);

        List<Subscriptions> subscriptionsList = query.getResultList();
        return subscriptionsList ;
    }


    public List<Subscriptions> findByUser(User user) {
        Query query= Main.getSession().createQuery( "from Subscriptions where user=:user");

        query.setParameter("user", user);

        List<Subscriptions> subscriptionsList = query.getResultList();
        return subscriptionsList;
    }

    public Subscriptions findSubscriber(Topic topic,User user){
      Subscriptions subscriptions=null;
        Query query= Main.getSession().createQuery( "from Subscriptions where Topic=:topic and user=:user");
         query.setParameter("topic",topic);
        query.setParameter("user", user);
        subscriptions=(Subscriptions)query.getSingleResult();
        return subscriptions;


    }
}
