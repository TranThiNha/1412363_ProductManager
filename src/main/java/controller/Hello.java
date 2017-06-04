package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

/**
 * Created by MyPC on 6/1/2017.
 */

@Controller
public class Hello {
        @RequestMapping("/hello")
        public String hello(Model model){
            String message = "Hi, I'm nha!";
            model.addAttribute("massage",message);
            return "hello";
        }
}
