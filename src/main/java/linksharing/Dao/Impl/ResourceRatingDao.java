package linksharing.Dao.Impl;

import linksharing.entities.Resource;
import linksharing.entities.ResourceRating;
import linksharing.entities.User;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Query;
import java.util.List;

/**
 * Created by miral on 7/17/2017.
 */
public class ResourceRatingDao extends BaseDao<ResourceRating> {
    @Autowired
    linksharing.Main Main;
    public ResourceRatingDao(){
        super(ResourceRating.class);
    }

    public List<ResourceRating> findByUser(User user) {
        Query query= Main.getSession().createQuery( "from ResourceRating where user=:user");

        query.setParameter("user", user);

        List<ResourceRating> resourceRatings = query.getResultList();
        return resourceRatings;
    }


    public List<ResourceRating> findByResource(Resource resource) {
        Query query= Main.getSession().createQuery( "from ResourceRating where resource =:resource");

        query.setParameter("resource", resource);

        List<ResourceRating> resourceRatings = query.getResultList();
        return resourceRatings;
    }

}
