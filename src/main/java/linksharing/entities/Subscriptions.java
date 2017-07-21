package linksharing.entities;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by miral on 7/13/2017.
 */
@Entity
@Table
public class Subscriptions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int subscriptionId;
    @ManyToOne
    private Topic topic;
    @ManyToOne
    private User user;
    private Date dateCreated;
    @Enumerated(EnumType.STRING)
    private Seriousness seriousness;

    public Seriousness getSeriousness() {
        return seriousness;
    }

    public void setSeriousness(Seriousness seriousness) {
        this.seriousness = seriousness;
    }

    public int getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(int subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public enum Seriousness {
        Serious("Serious"), VerySerious("VerySerious"), Casual("Casual");

        private String value;

        Seriousness(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
