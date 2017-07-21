package linksharing.Dao.Impl;

import linksharing.Main;
import linksharing.entities.DocumentResource;
import linksharing.entities.Topic;
import linksharing.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.Query;
import java.util.List;

/**
 * Created by miral on 7/17/2017.
 */

@Component
public class DocumentResourceDao extends BaseDao<DocumentResource> {

    @Autowired
    Main Main;
    public DocumentResourceDao(){
        super(DocumentResource.class);
    }

    public List<DocumentResource> findByUser(User user) {
        Query query= Main.getSession().createQuery( "from DocumentResource where createdBy=:creator");

        query.setParameter("creator", user);

        List<DocumentResource> documentResources = query.getResultList();
        return documentResources ;
    }


    public List<DocumentResource> findByTopic(Topic topic) {
        Query query= Main.getSession().createQuery( "from DocumentResource where topic=:topic");

        query.setParameter("topic", topic);

        List<DocumentResource> documentResources = query.getResultList();
        return documentResources ;
    }
}
