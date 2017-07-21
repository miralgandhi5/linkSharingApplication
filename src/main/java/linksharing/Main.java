package linksharing;

import org.hibernate.HibernateException;
import org.hibernate.Metamodel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.metamodel.EntityType;

/**
 * Created by miral on 7/13/2017.
 */
@Component
public class Main {
    @Autowired
    SessionFactory ourSessionFactory;


    public  Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }

    public  void main(final String[] args) throws Exception {
        final Session session = getSession();
        try {
            System.out.println("querying all the managed linksharing.entities...");
            final Metamodel metamodel = session.getSessionFactory().getMetamodel();
            for (EntityType<?> entityType : metamodel.getEntities()) {
                final String entityName = entityType.getName();
                final Query query = session.createQuery("from " + entityName);
                System.out.println("executing: " + query.getQueryString());
                for (Object o : query.list()) {
                    System.out.println("  " + o);
                }
            }
        } finally {
            session.close();
        }
    }
}