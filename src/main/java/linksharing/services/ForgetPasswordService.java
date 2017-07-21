package linksharing.services;

import linksharing.Dao.Impl.ForgetPasswordDao;
import linksharing.Dao.Impl.UserDao;
import linksharing.entities.ForgetPassword;
import linksharing.entities.User;
import linksharing.util.EmailServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by miral on 7/21/2017.
 */
@Service
public class ForgetPasswordService {
@Autowired
    ForgetPasswordDao forgetPasswordDao;
@Autowired
    UserDao userDao;

    public void forgetPassword(User user, String email, String contextPath){

        String token= UUID.randomUUID().toString();
        ForgetPassword forgetPassword=new ForgetPassword(user,token);
        forgetPasswordDao.save(forgetPassword);
        String url = contextPath + "/changePassword?id=" + user.getUserId() + "&token=" + token;
        System.out.println(url+":"+email);
        EmailServiceimpl emailServiceimpl=new EmailServiceimpl();
        emailServiceimpl.send(email,"Forgot Password link"," \r\n" + url);


    }
    public ForgetPassword validatePassword(Integer id, String token) {
        System.out.println(id+":"+token);
        ForgetPassword forgetToken = forgetPasswordDao.findByTokenAndUser(userDao.get(id), token);
       /* System.out.println(forgetToken.getExpiryDate() +":"
                +forgetToken);*/
       /* Calendar cal = Calendar.getInstance();
        if ((forgetToken.getExpiryDate()
                .getTime() - cal.getTime()
                .getTime()) <= 0) {
            return "expired";
        }*/
        return  forgetToken;
    }

    public void destroyToken(ForgetPassword forgetPassword){

        forgetPasswordDao.delete(forgetPassword);
    }

}
