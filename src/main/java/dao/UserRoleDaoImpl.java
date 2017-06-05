package dao;

import model.UserRole;
import model.UserRoleId;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by MyPC on 6/4/2017.
 */
public class UserRoleDaoImpl implements UserRoleDao {


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


    public UserRole getUserRole(UserRoleId id) {
        UserRole userRole = null;
        try {
            getSession().beginTransaction();
            userRole = (UserRole) getSession().get(UserRole.class,id);
            getSession().getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
        }
        return userRole;
    }

    public List<UserRole> getAllUserRole() {
        List<UserRole> userRoleList = null;
        try {
            getSession().beginTransaction();
            userRoleList = getSession().createCriteria(UserRole.class).list();
            getSession().getTransaction().commit();

        }catch (Exception e){
            e.printStackTrace();
        }
        return userRoleList;
    }
}
