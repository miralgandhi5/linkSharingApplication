package linksharing.dto;

import linksharing.entities.DocumentResource;
import linksharing.entities.ReadingItem;

/**
 * Created by miral on 7/21/2017.
 */
public class ReadingItemDto {
    private Integer id;
    private String username;
    private String topicName;
    private String desc;
    private boolean doc;

    public ReadingItemDto(ReadingItem item) {
        this.id = item.getId();
        this.username = item.getUser().getUserName();
        this.topicName = item.getResource().getTopic().getName();
        this.desc = item.getResource().getDescription();
        this.doc = item.getResource() instanceof DocumentResource;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean isDoc() {
        return doc;
    }

    public void setDoc(boolean doc) {
        doc = doc;
    }
}
