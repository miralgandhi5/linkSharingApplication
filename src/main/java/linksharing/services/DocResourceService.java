package linksharing.services;

import linksharing.Dao.Impl.DocumentResourceDao;
import linksharing.Dao.Impl.LinkResourceDao;
import linksharing.Dao.Impl.TopicDao;
import linksharing.Dao.Impl.UserDao;
import linksharing.entities.DocumentResource;
import linksharing.entities.LinkResource;
import linksharing.entities.Resource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by miral on 7/19/2017.
 */

@Service
public class DocResourceService {

    @Autowired
    SessionFactory ourSession;

    @Autowired
    DocumentResourceDao documentResourceDao;
    @Autowired
    UserDao userDao;
    @Autowired
    TopicDao topicDao;

    public Resource create(String path, String description, Integer userId, Integer topicId){
        System.out.println("save resource added");
        DocumentResource documentResource=new DocumentResource();
        documentResource.setPath(path);
        documentResource.setDescription(description);
        String msg="resource added";
        System.out.println(msg+path+topicId+userId+description);
        documentResource.setCreatedBy(userDao.get(userId));
        documentResource.setTopic(topicDao.get(topicId));
        DocumentResource documentResource1=null;
       documentResource1 = documentResourceDao.save(documentResource);


        return documentResource1;
    }
}
