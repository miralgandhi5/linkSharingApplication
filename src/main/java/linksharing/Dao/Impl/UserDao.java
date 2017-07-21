package linksharing.Dao.Impl;

import linksharing.Main;
import linksharing.entities.User;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.Query;

/**
 * Created by miral on 7/14/2017.
 */

@Component
public class UserDao extends BaseDao<User> {

    @Autowired
    Main Main;
    public UserDao() {
        super(User.class);
    }


    public User findByUserNameAndPass(String userName, String password) {
        String hql = "from User where userName=:userName and password=:password";
        return withSession(new Operation<User>() {
            @Override
            public User operate(Session session) {
                Query query = session.createQuery(hql, User.class);
                query.setParameter("userName", userName);
                query.setParameter("password",password);
                User user = null;
                try {
                    user = (User) query.getSingleResult();
                } catch (Exception e) {

                }
                return user;
            }
        });
    }
/*

    public User findByUserByEmail(String email) {
        Query query = Main.getSession().createQuery("from User where email=:email");
        query.setParameter("email", email);
        User user = (User) query.getSingleResult();
        return user;
    }
*/

    public User findByUserByEmail(String email) {
        String hql = "from User where email=:email";
        return withSession(new Operation<User>() {
            @Override
            public User operate(Session session) {
                Query query = session.createQuery(hql, User.class);
                query.setParameter("email", email);
                User user = null;
                try {
                    user = (User) query.getSingleResult();
                } catch (Exception e) {

                }
                return user;
            }
        });
    }

    public User findByUserNameOrEmailAndPass(String userName, String password) {
        Query query = Main.getSession().createQuery("from User where userName=:userName or email=:userName and password=:password");

        query.setParameter("userName", userName);

        query.setParameter("password", password);
        User user = (User) query.getSingleResult();
        return user;
    }

    public Boolean checkUserName(String userName){
        Query query = Main.getSession().createQuery("from User where userName=:userName ");
        query.setParameter("userName", userName);
        User result=null;
       try{  result=(User)query.getSingleResult();}catch (Exception ex){
           System.out.println("in check name ");
       }
        System.out.println("result"+result);
        if(result==null)
            return true;
        return false;

    }
    public Boolean checkEmail(String email){
        Query query = Main.getSession().createQuery("from User where email=:email ");
        query.setParameter("email", email);
        User result=null;
        try{  result=(User)query.getSingleResult();}catch (Exception ex){
            System.out.println("in check email ");
        }
        System.out.println("result"+result);
        if(result==null)
            return true;
        return false;


    }
}
