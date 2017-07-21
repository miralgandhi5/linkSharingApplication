package linksharing.entities;

import javax.persistence.Entity;

/**
 * Created by miral on 7/13/2017.
 */
@Entity
public class LinkResource extends Resource {
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
