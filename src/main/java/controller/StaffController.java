package controller;

import dao.ProductDaoImpl;
import dao.UserDao;
import dao.UserDaoImpl;
import model.Product;
import model.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by MyPC on 6/5/2017.
 */
@Controller
public class StaffController {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
    ProductDaoImpl productDao = (ProductDaoImpl)context.getBean("productDao");
    UserDaoImpl userDao = (UserDaoImpl) context.getBean("userDao");

    List<Product> products = productDao.getAllProduct();

    @RequestMapping(value = "/show-list-staff")
    public String adminPage( Model model){
        //List<User> userList = User.getAllUser();

        Product product = new Product(1,"dien thoai",123234.03,"describe");
        products.add(product);
        products.add(product);
        products.add(product);
        int index = 0;
        model.addAttribute("index", index);
        model.addAttribute("listResult",products);
        return "show-list-staff";
    }

    @RequestMapping(value = "/profile-staff",method = RequestMethod.GET)
    public String formPage(Model model){
        User user = userDao.getUser("nhatran");
        model.addAttribute("full_name",user.getFullname());
        model.addAttribute("user_name",user.getUserName());
        model.addAttribute("gender",user.getGender());
        model.addAttribute("birthday",user.getBirthday());
        return "profile-staff";
    }
}
