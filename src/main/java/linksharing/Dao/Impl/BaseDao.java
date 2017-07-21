package linksharing.Dao.Impl;

import linksharing.Dao.Dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by miral on 7/14/2017.
 */
public class BaseDao<T> implements Dao<T> {

    @Autowired
    SessionFactory sessionFactory;

    private Class<T> entityClass;


    protected BaseDao(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    @Override
    public List<T> list() {
        Session session = sessionFactory.openSession();
        List<T> dataList = session.createQuery("FROM " + entityClass).list();
        session.close();
        System.out.println("Found " + dataList.size());
        return dataList;
    }

    @Override
    public T get(Integer id) {
        Session session = sessionFactory.openSession();
        T object = (T) session.get(entityClass, id);
        session.close();
        return object;
    }

    @Override
    public T load(Long id) {
        Session session = sessionFactory.openSession();
        T object = (T) session.load(entityClass, id);
        session.close();
        return object;
    }

    @Override
    public T save(T entity) {
        Session session =sessionFactory.openSession();
        session.beginTransaction();
        session.save(entity);
        session.getTransaction().commit();
        session.close();
        System.out.println("Successfully created " + entity.toString());
        return entity;
    }

    @Override
    public T update(T entity) {
        System.out.println("Successfully updated ");
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(entity);
        session.getTransaction().commit();
        session.close();
        System.out.println("Successfully updated ");
        return entity;
    }

    @Override
    public T refresh(T entity) {
        return null;
    }

    @Override
    public void delete(T entity) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(entity);
        System.out.println("Successfully deleted ");

    }

    public T withSession(Operation<T> operation){
        Session session = sessionFactory.openSession();
        T obj = operation.operate(session);
        session.close();
        return obj;
    }

    public interface Operation<E> {
        E operate(Session session);
    }
}
