package linksharing.Dao.Impl;

import linksharing.entities.DocumentResource;
import linksharing.entities.ForgetPassword;
import linksharing.entities.User;
import org.hibernate.Session;
import org.springframework.stereotype.Component;

import javax.persistence.Query;

/**
 * Created by miral on 7/19/2017.
 */

@Component
public class ForgetPasswordDao extends BaseDao<ForgetPassword> {

    public ForgetPasswordDao(){
        super(ForgetPassword.class);
    }

    public ForgetPassword findByTokenAndUser(User user, String token) {
        String hql = "from ForgetPassword where user=:user and token=:token";
        return withSession(new Operation<ForgetPassword>() {
            @Override
            public ForgetPassword operate(Session session) {
                Query query = session.createQuery(hql, ForgetPassword.class);
                query.setParameter("user", user);
                query.setParameter("token",token);
               ForgetPassword forgetPassword = null;
                try {
                   forgetPassword = (ForgetPassword) query.getSingleResult();
                } catch (Exception e) {

                }
                return forgetPassword;
            }
        });
    }
}
