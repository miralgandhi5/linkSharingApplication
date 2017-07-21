package linksharing.services;

import linksharing.Dao.Impl.LinkResourceDao;
import linksharing.Dao.Impl.TopicDao;
import linksharing.Dao.Impl.UserDao;
import linksharing.entities.LinkResource;
import linksharing.entities.Resource;
import linksharing.entities.Topic;
import linksharing.entities.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by miral on 7/18/2017.
 */
@Service
public class LinkResourceService {
    @Autowired
    SessionFactory ourSession;

    @Autowired
    LinkResourceDao linkResourceDao;
    @Autowired
    UserDao userDao;
    @Autowired
    TopicDao topicDao;

    public Resource create(String url, String description, Integer userId, Integer topicId){
        System.out.println("save resource added");
        LinkResource linkResource=new LinkResource();
        linkResource.setUrl(url);
        linkResource.setDescription(description);
        String msg="resource added";
        System.out.println(msg+url+topicId+userId+description);
        linkResource.setCreatedBy(userDao.get(userId));
        linkResource.setTopic(topicDao.get(topicId));
      LinkResource linkResource1=  linkResourceDao.save(linkResource);

        if(linkResource1==null)
            msg="not saved";
        else {
            System.out.println(linkResource1);

        }
        return linkResource1;
    }
}
