package linksharing.services;

import linksharing.Dao.Impl.InvitationDao;
import linksharing.entities.Invitation;
import linksharing.entities.Subscriptions;
import linksharing.entities.Topic;
import linksharing.entities.User;
import linksharing.util.EmailServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by miral on 7/19/2017.
 */
@Service
public class InvitationService {

    @Autowired
    InvitationDao invitationDao;

    public Invitation createInvite(Topic topic, Subscriptions subscriptions,User reciever){

        Invitation invitation=new Invitation();
        invitation.setReceiver(reciever);
        invitation.setSender(subscriptions);
        invitation.setStatus(Invitation.inviteStatus.pending);
        Invitation invitation1=null;
        invitation1=invitationDao.save(invitation);
        return invitation1;


    }

    public void invitationMail(Invitation invitation,User sender,String email)
    {
        String contextPath="http://localhost:8085/user";
        String url = contextPath + "/invite?id=" +invitation.getId() ;
        System.out.println(url+":"+email);
        String msg="invitation for topic "+invitation.getTopic()+" by user "+sender.getUserName();
        EmailServiceimpl emailServiceimpl=new EmailServiceimpl();
        emailServiceimpl.send(email,"Invitation for subscription"," \r\n" + url);
    }
}
