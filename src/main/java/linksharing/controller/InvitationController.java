package linksharing.controller;

import linksharing.Dao.Impl.UserDao;
import linksharing.entities.Invitation;
import linksharing.entities.Subscriptions;
import linksharing.entities.Topic;
import linksharing.entities.User;
import linksharing.services.InvitationService;
import linksharing.services.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by miral on 7/19/2017.
 */
@Controller
public class InvitationController {
    @Autowired
    UserDao userDao;
    @Autowired
    InvitationService invitationService;
    @Autowired
    SubscriptionService subscriptionService;
    @RequestMapping(value = "/sendInvite")
    @ResponseBody
    String sendInvite(Topic topic,String email){
        User user=null;
        user=userDao.findByUserByEmail(email);
        if(user==null)
            return "invalid user";
        Subscriptions subscriptions=subscriptionService.getSubscriber(user,topic);

       Invitation invitation= invitationService.createInvite(topic,subscriptions,user);
       if(invitation==null)
           return "not send";

       return "successfully send";
    }
}
