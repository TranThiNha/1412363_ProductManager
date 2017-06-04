package dao;


import model.User;

import java.util.List;

import static utils.HibernateUtil.getSession;

/**
 * Created by MyPC on 6/4/2017.
 */
public class UserDaoImpl implements UserDao {



    public User get(String username) {
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
