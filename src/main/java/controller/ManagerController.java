package controller;

import dao.ProductDaoImpl;
import model.Product;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.ModelAndView;
import model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by MyPC on 6/2/2017.
 */
@Controller
public class ManagerController {

    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
    ProductDaoImpl productDao = (ProductDaoImpl)context.getBean("productDao");

    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public ModelAndView homePage(){

        return new ModelAndView("home","command",new User());
    }

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public ModelAndView indexPage(){
        return new ModelAndView("home");
    }

    @RequestMapping(value = "/form",method = RequestMethod.GET)
    public String formPage(Model model){
        model.addAttribute("product",new Product());
        return "form";
    }


    List<Product> products = productDao.getAllProduct();

    @RequestMapping(value = "/show-list")
    public String adminPage( Model model){
        //List<User> userList = User.getAllUser();

        Product product = new Product(1,"dien thoai",123234.03,"describe");
        products.add(product);
        products.add(product);
        products.add(product);
        int index = 0;
        model.addAttribute("index", index);
        model.addAttribute("listResult",products);
        return "show-list";
    }


    @RequestMapping(value = "/delete")
    public String delete(@RequestParam("id") int[] indexs,Model modelMap){
        for (int i = 0; i < indexs.length ; i++){
            productDao.deleteProduct(products.get(indexs[i]).getId());
        }

        for (int i=  indexs.length - 1; i>=0;i++){
            products.remove(indexs[i]);
        }

        modelMap.addAttribute("listResult",products);
        return "show-list";
    }

    @RequestMapping(value = "/edit")
    public String edit(@RequestParam("index") int index,
                       @RequestParam("id")int id,
                       @RequestParam("name")String name,
                       @RequestParam("cost")Double cost,
                       @RequestParam("description")String description, Model modelMap){

        Product product = new Product(id,name,cost,description);
        productDao.updateProduct(product);
        products.set(index,product);
        modelMap.addAttribute("index", index);
        modelMap.addAttribute("listResult",products);
        return "show-list";
    }

    @RequestMapping(value = "/detail")
    public String detail(@RequestParam("id") int index,Model model){
        model.addAttribute("index",index);
        model.addAttribute("model",products.get(index));
        return "detail";
    }



    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@ModelAttribute("product") Product product, BindingResult result, ModelMap modelMap){
        product.setId(generateID());
        productDao.createProduct(product);
        products.add(product);
        modelMap.addAttribute("listResult",products);
        return "show-list";
    }

    public int generateID(){
        Random random = new Random();

        List<Integer>existIDList = new ArrayList<Integer>();
        for (int  i = 0 ; i < products.size() ; i++){
            existIDList.add(products.get(i).getId());
        }

        int newId = random.nextInt(Integer.MAX_VALUE);
        while (existIDList.contains(newId)){
            newId = random.nextInt(Integer.MAX_VALUE);
        }

        return newId;

    }



}

