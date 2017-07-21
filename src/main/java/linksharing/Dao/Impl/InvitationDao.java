package linksharing.Dao.Impl;

import linksharing.entities.Invitation;
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
public class InvitationDao extends BaseDao<Invitation> {
    @Autowired
    linksharing.Main Main;

    public InvitationDao(){
        super(Invitation.class);
    }

    public List<Invitation> findByUser(User user) {
        Query query= Main.getSession().createQuery( "from Invitation where receiver=:creator");

        query.setParameter("creator", user);

        List<Invitation> invitations = query.getResultList();
        return invitations;
    }


    public List<Invitation> findByTopic(Topic topic) {
        Query query= Main.getSession().createQuery( "from Invitation where topic=:topic");

        query.setParameter("topic", topic);

        List<Invitation> invitations = query.getResultList();
        return invitations;
    }




    public List<Invitation> findBySubscriber(Subscriptions subscriptions) {
        Query query= Main.getSession().createQuery( "from Invitation where sender=:subscriber");

        query.setParameter("subscriber", subscriptions);

        List<Invitation> invitations = query.getResultList();
        return invitations;
    }


    public List<Invitation> findByStatusAndTopic(Topic topic, Invitation.inviteStatus status) {
        Query query= Main.getSession().createQuery( "from Invitation where topic=:topic and status=:status");
        query.setParameter("status",status);
        query.setParameter("topic",topic);

        List<Invitation> invitations = query.getResultList();
        return invitations;
    }
}
