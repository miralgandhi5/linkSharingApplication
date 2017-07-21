package linksharing.entities;

import javax.persistence.*;

/**
 * Created by miral on 7/13/2017.
 */
@Entity
@Table
public class Invitation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @OneToOne
    private Subscriptions sender;
    @OneToOne
    private User receiver ;
    @OneToOne
    private Topic topic ;
    private inviteStatus status;

    public inviteStatus getStatus() {
        return status;
    }

    public void setStatus(inviteStatus status) {
        this.status = status;
    }

    public enum inviteStatus{
        pending,accepted,rejected;
    };

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Subscriptions getSender() {
        return sender;
    }

    public void setSender(Subscriptions sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }
}
