package linksharing.controller;

import linksharing.Dao.Impl.UserDao;
import linksharing.co.ForgetPasswordCo;
import linksharing.dto.ForgetPasswordResponseDto;
import linksharing.dto.ReadingItemDto;
import linksharing.entities.ForgetPassword;
import linksharing.entities.ReadingItem;
import linksharing.entities.Topic.visibility;
import linksharing.entities.User;
import linksharing.services.ForgetPasswordService;
import linksharing.services.ReadingItemService;
import linksharing.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static linksharing.util.ModelAndViewBuilder.redirect;
import static linksharing.util.ModelAndViewBuilder.view;

/**
 * Created by miral on 7/13/2017.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserDao userDao;

    @Autowired
    UserService userService;

    @Autowired
    ReadingItemService readingItemService;

    @Autowired
    ForgetPasswordService forgetPasswordService;


    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    ModelAndView submitForm(@ModelAttribute User user, @RequestParam("phot") MultipartFile phot, HttpServletRequest request) {

        if (phot != null)
            try {
                user.setPhoto(phot.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        else {
            Path path = Paths.get("resources/images/pic.png");
            try {
                user.setPhoto(Files.readAllBytes(path));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        User user1 = userService.registration(user);
        HttpSession session = request.getSession();
        session.setAttribute("User", user);
        return view("dashboard").build();


    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    ModelAndView update(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String email, @RequestParam String userName, @RequestParam("phot") MultipartFile phot, HttpServletRequest request) {

        HttpSession session = request.getSession(false);
        User user = (User) session.getAttribute("User");
        if (phot != null)
            try {
                user.setPhoto(phot.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setUserName(userName);
        user.setEmail(email);
        user.setLastUpdated(new Date());
        User user1 = userService.update(user);
        session.setAttribute("User", user1);


        return view("profileupdate").build();



    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    ModelAndView login(@RequestParam String user1, @RequestParam String password1, HttpServletRequest request) {
        System.out.println("login");

        User user = userService.login(user1, password1);
        if (user == null)
            return view("index").build();
        HttpSession session = request.getSession();
        session.setAttribute("User", user);
        List<ReadingItem> readingItemList = readingItemService.findByReadStatusTopicAndUser(user);
        List<ReadingItemDto> readingItemListDtos = new ArrayList<>();
        for(ReadingItem item: readingItemList){
            readingItemListDtos.add(new ReadingItemDto(item));
        }
        System.out.println(readingItemList);
        return view("dashboard").modelAttr("User", user).modelAttr("visibilities", visibility.values()).modelAttr("userId", user.getUserId()).modelAttr("lists", readingItemListDtos).build();
    }

    @RequestMapping(value = "/getPhoto", method = RequestMethod.GET)
    void getPhoto(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession(false);
        User user = (User) session.getAttribute("User");
        System.out.println(user);
        if (user.getPhoto() != null)
            response.getOutputStream().write(user.getPhoto());

    }


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index(@ModelAttribute User user) {

        return view("index").build();
    }

    @RequestMapping(value = "/forgetPassword", method = RequestMethod.POST)
    public @ResponseBody
    String forgetPassword(ForgetPasswordCo co, HttpServletRequest request) {
        String email = co.getEmail();
        System.out.println("in forget password");
        System.out.println("Email " + co.getEmail());
        ForgetPasswordResponseDto dto = new ForgetPasswordResponseDto(true, "Email has been sent to your email address");
        User user = userDao.findByUserByEmail(email);
        if (user == null) {
            dto.setSuccess(false);
            dto.setMessage("Email doesn't exists");
        } else
            forgetPasswordService.forgetPassword(user, email, "http://localhost:8085/user/");

        return dto.getMessage();
    }

    @RequestMapping(value = "/changePassword", method = RequestMethod.GET)
    @ResponseBody
    ModelAndView changePassword(String password, HttpServletRequest request) {
        HttpSession session=request.getSession();
      User user=(User)session.getAttribute("User");
      user.setLastUpdated(new Date());
      user.setPassword(password);
      userService.update(user);
      session.invalidate();
      return view("index").build();


    }

    @RequestMapping(value = "/resetPassword", method = RequestMethod.POST)
    @ResponseBody
    ModelAndView resetPassword(String password, Integer id, HttpServletRequest request) {
       /* Integer id=(Integer)request.getAttribute("id");*/
        System.out.println(password);
        System.out.println(id);
        User user = userDao.get(id);
        System.out.println(user);
        user.setPassword(password);
        userDao.update(user);
        return view("index").build();
    }

    @RequestMapping(value = "/checkUserName", method = RequestMethod.GET)
    @ResponseBody
    Boolean checkUserName(String userName) {

        System.out.println("here");
        return userDao.checkUserName(userName);
    }

    @RequestMapping(value = "/checkEmail", method = RequestMethod.GET)
    @ResponseBody
    Boolean checkEmail(String email) {

        System.out.println("here");
        return userDao.checkEmail(email);
    }

    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    @ResponseBody
    ModelAndView viewProfile() {
        return view("profileupdate").build();
    }

    public String forget() {
        return redirect("/user/forgetPassword");
    }
}
