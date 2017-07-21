package linksharing.controller;

import linksharing.entities.LinkResource;
import linksharing.entities.Resource;
import linksharing.entities.Topic;
import linksharing.entities.User;
import linksharing.services.DocResourceService;
import linksharing.services.LinkResourceService;
import linksharing.services.ReadingItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.file.Path;

/**
 * Created by miral on 7/18/2017.
 */

@Controller
@RequestMapping("/resource")
public class LinkResourceController {
@Autowired
LinkResourceService linkResourceService;
@Autowired
    DocResourceService docResourceService;
@Autowired
    ReadingItemService readingItemService;


    @RequestMapping(value = "/createlinkresource",method = RequestMethod.POST)
    @ResponseBody
    String createLinkResource(String url,String description,Integer userId,Integer topicId) {
        String msg="resource saved";
        Resource resource=linkResourceService.create(url,description,userId,topicId);
        if(resource!=null)
         readingItemService.addReadingItem(resource);
        else
            msg="resource not saved";

        return msg;

    }

    @RequestMapping(value = "/createdocresource", method = RequestMethod.POST)
    @ResponseBody
    String submitForm(MultipartFile file, String des, Integer Topics, HttpServletRequest request) {

        // FileOutputStream fileOutputStream=new FileOutputStream(multipartFile.getOriginalFilename());


        String path=request.getSession().getServletContext().getRealPath("/");
        User user=(User)request.getSession(false).getAttribute("User");
        String filename=file.getOriginalFilename();
        String msg=null;
        System.out.println(path+" "+filename);
        try{
            byte barr[]=file.getBytes();

            BufferedOutputStream bout=new BufferedOutputStream(
                    new FileOutputStream(path+"/"+filename));
            bout.write(barr);
            bout.flush();
            bout.close();

        }catch(Exception e){System.out.println(e);}
        String finalpath=path+"/"+filename;
        Resource resource= docResourceService.create(finalpath,des,user.getUserId(),Topics);
        if(resource!=null)
            readingItemService.addReadingItem(resource);
        else
            msg="resource not saved";

        return msg;
    }
}


