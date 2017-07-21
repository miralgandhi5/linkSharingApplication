package linksharing.services;

import linksharing.Dao.Impl.ReadingItemDao;
import linksharing.Dao.Impl.SubscriptionDao;
import linksharing.Dao.Impl.TopicDao;
import linksharing.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by miral on 7/19/2017.
 */

@Service
public class ReadingItemService {

    @Autowired
    ReadingItemDao readingItemDao;

    @Autowired
    SubscriptionDao subscriptionDao;

    public void addReadingItem(Resource resource){
        Topic topic=resource.getTopic();
        for (Subscriptions subscriptions: subscriptionDao.findByTopic(topic)
             ) {
            System.out.println("res");
            ReadingItem readingItem=new ReadingItem();
            readingItem.setResource(resource);
            readingItem.setUser(subscriptions.getUser());
            readingItem.setRead(false);
            readingItemDao.save(readingItem);
        }

    }

    public void changeIsRead(ReadingItem readingItem){
        readingItem.setRead(true);
        readingItemDao.update(readingItem);

    }

    public List<ReadingItem> findByReadStatusTopicAndUser(User user) {
        System.out.println("reading list");
        List<ReadingItem> readingItems = readingItems = readingItemDao.findByReadStatusTopicAndUser(false, user);
        return readingItems;
    }
}
