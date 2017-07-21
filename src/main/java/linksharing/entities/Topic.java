package linksharing.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by miral on 7/13/2017.
 */
@Entity
@Table
public class Topic {
    @OneToMany
    List<Subscriptions> subscriptionsList = new ArrayList<>();
    @OneToMany
    List<Resource> resourceList = new ArrayList<>();
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int topicId;
    private String name;
    @ManyToOne
    private User createdBy;
    private Date dateCreated;
    private Date lastUpdated;
    @Enumerated(EnumType.STRING)
    private visibility visible;

    public visibility getVisible() {
        return visible;
    }

    public void setVisible(visibility visible) {
        this.visible = visible;
    }

    public List<Subscriptions> getSubscriptionsList() {
        return subscriptionsList;
    }

    public void setSubscriptionsList(List<Subscriptions> subscriptionsList) {
        this.subscriptionsList = subscriptionsList;
    }

    public List<Resource> getResourceList() {
        return resourceList;
    }

    public void setResourceList(List<Resource> resourceList) {
        this.resourceList = resourceList;
    }

    public int getTopicId() {
        return topicId;
    }

    public void setTopicId(int topicId) {
        this.topicId = topicId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

   public enum visibility {
        Public("Public"), Private("Private");
        private String visiblle;
        visibility(String value){
            this.visiblle=value;
        }

       public String getVisiblle() {
           return visiblle;
       }

       public void setVisiblle(String visiblle) {
           this.visiblle = visiblle;
       }
   }
}
