package linksharing.controller;

import linksharing.Dao.Impl.ReadingItemDao;
import linksharing.entities.ReadingItem;
import linksharing.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by miral on 7/20/2017.
 */
@Controller
public class ReadingItemController {

    @Autowired
    ReadingItemDao readingItemDao;

    @RequestMapping(value = "/unreadReasource", method = RequestMethod.GET)
    @ResponseBody
    public List<ReadingItem> findByReadStatusTopicAndUser(HttpServletRequest request) {
        User user = (User) request.getSession(false).getAttribute("User");
        return readingItemDao.findByReadStatusTopicAndUser(false, user);
    }
}
