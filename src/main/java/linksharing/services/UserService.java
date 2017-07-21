package linksharing.services;

import linksharing.Dao.Impl.ForgetPasswordDao;
import linksharing.Dao.Impl.UserDao;
import linksharing.entities.ForgetPassword;
import linksharing.entities.User;
import linksharing.util.EmailService;
import linksharing.util.EmailServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

/**
 * Created by miral on 7/17/2017.
 */
@Service
public class UserService {
    @Autowired
    UserDao userDao;
    @Autowired
    ForgetPasswordDao forgetPasswordDao;




    public User registration(User user) {
        System.out.println("save");
        System.out.println(user);


        User user1 = userDao.save(user);
        System.out.println(user1);
        return  user1;
    }

   public User login(String username, String pswd){
        User user=userDao.findByUserNameAndPass(username,pswd);
      return user;
        }

   public User update(User user){
        return userDao.update(user);
   }


}
