package linksharing.Dao.Impl;

import linksharing.Main;
import linksharing.entities.ReadingItem;
import linksharing.entities.Resource;
import linksharing.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.Query;
import java.util.List;

/**
 * Created by miral on 7/17/2017.
 */
@Component
public class ReadingItemDao extends BaseDao<ReadingItem> {
    @Autowired
    Main Main;

    public ReadingItemDao(){
        super(ReadingItem.class);
    }

    public List<ReadingItem> findByUser(User user) {
        Query query= Main.getSession().createQuery( "from ReadingItem where user=:user");

        query.setParameter("user", user);

        List<ReadingItem> readingItems = query.getResultList();
        return readingItems;
    }


    public List<ReadingItem> findByReadStatus(Boolean isRead) {
        Query query= Main.getSession().createQuery( "from ReadingItem where isRead=:isread");

        query.setParameter("isread", isRead);

        List<ReadingItem> readingItems = query.getResultList();
        return readingItems;
    }


    public List<ReadingItem> findByReadStatusAndTopic(Boolean isRead, Resource resource) {
        Query query= Main.getSession().createQuery( "from ReadingItem where isRead=:isread and resource=:resource");

        query.setParameter("isread", isRead);
        query.setParameter("resource", resource);

        List<ReadingItem> readingItems = query.getResultList();
        return readingItems;
    }


    public List<ReadingItem> findByReadStatusTopicAndUser(Boolean isRead,  User user) {
        Query query= Main.getSession().createQuery( "from ReadingItem where isRead=:isread and user=:user");

        query.setParameter("isread", isRead);
        query.setParameter("user", user);

        List<ReadingItem> readingItems = query.getResultList();
        return readingItems;
    }

}
