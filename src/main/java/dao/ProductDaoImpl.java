package dao;

import model.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by MyPC on 6/4/2017.
 */
public class ProductDaoImpl implements ProductDao {

    private static SessionFactory sessionFactory;

    public SessionFactory getSessionFactory(){
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    public static Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    public void createProduct(Product product) {
        try {

            getSession().beginTransaction();
            getSession().save(product);
            getSession().getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void updateProduct(Product newProduct) {
        try {

            getSession().beginTransaction();
            getSession().update(newProduct);
            getSession().getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void deleteProduct(int id) {
        try {
            getSession().beginTransaction();
            Product product = (Product)getSession().get(Product.class,id);
            if (product!=null){
                getSession().delete(product);
            }
            getSession().getTransaction().commit();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public Product getProduct(int id) {
        Product product = null;
        try {
            getSession().beginTransaction();
            product = (Product) getSession().get(Product.class,id);
            getSession().getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
        }
        return product;
    }

    public List<Product> getAllProduct() {
        List<Product> productList = null;
        try {
            getSession().beginTransaction();
            productList = getSession().createCriteria(Product.class).list();
            getSession().getTransaction().commit();

        }catch (Exception e){
            e.printStackTrace();
        }
        return productList;
    }


}
