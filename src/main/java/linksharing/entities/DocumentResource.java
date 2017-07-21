package linksharing.entities;
import javax.persistence.Entity;

/**
 * Created by miral on 7/13/2017.
 */
@Entity

public class DocumentResource extends Resource {
    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
