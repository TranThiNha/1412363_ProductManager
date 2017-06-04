package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;
import model.User;

/**
 * Created by MyPC on 6/2/2017.
 */
@Controller
public class SecurityNavigation {


    @RequestMapping(value = "/login-form", method = RequestMethod.GET)
    public String loginForm(Model model){
        model.addAttribute("user",new User());
        return "login-form";
    }


    @RequestMapping(value = "/error-login",method = RequestMethod.GET)
    public ModelAndView invalidLogin(){
        ModelAndView modelAndView = new ModelAndView("login-form");
        modelAndView.addObject("error",true);
        return modelAndView;
    }

    @RequestMapping(value = "/success-login",method = RequestMethod.GET)
    public ModelAndView successLogin(){
        return new ModelAndView("home");
    }
}
