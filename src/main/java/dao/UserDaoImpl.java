package dao;


import model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;


/**
 * Created by MyPC on 6/4/2017.
 */
public class UserDaoImpl implements UserDao {

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


    public User getUser(String username) {
        User user = null;
        try {
            getSession().beginTransaction();
            user = (User) getSession().get(User.class,username);
            getSession().getTransaction().commit();
        }catch (Exception e){
           e.printStackTrace();
        }
        return user;
    }

    public List<User> getAllUser() {
        List<User> userList = null;
        try {
            getSession().beginTransaction();
            userList = getSession().createCriteria(User.class).list();
            getSession().getTransaction().commit();

        }catch (Exception e){
            e.printStackTrace();
        }
        return userList;
    }
}
