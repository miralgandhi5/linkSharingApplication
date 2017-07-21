package linksharing.Dao.Impl;

import linksharing.entities.LinkResource;
import linksharing.entities.Resource;
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
public class LinkResourceDao extends BaseDao<LinkResource> {
    @Autowired
    linksharing.Main Main;

    public LinkResourceDao(){
        super(LinkResource.class);
    }

    public List<LinkResource> findByUser(User user) {
        Query query= Main.getSession().createQuery( "from linkresource where createdBy=:creator");

        query.setParameter("creator", user);

        List<LinkResource> linkResources = query.getResultList();
        return linkResources ;
    }


    public List<LinkResource> findByTopic(Topic topic) {
        Query query= Main.getSession().createQuery( "from LinkResource where topic=:topic");

        query.setParameter("topic", topic);

        List<LinkResource> linkResources = query.getResultList();
        return linkResources ;
    }
}
