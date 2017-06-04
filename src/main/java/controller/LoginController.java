package controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.portlet.ModelAndView;
import model.User;

/**
 * Created by MyPC on 6/2/2017.
 */
@Controller
@SessionAttributes
public class LoginController {
    @RequestMapping(value = "/user-login",method = RequestMethod.POST)
    public String login(@ModelAttribute("user")User user, BindingResult result){
        System.out.println("username: "+ user.getUserName());
        return "redirect:home.html";
    }

}
