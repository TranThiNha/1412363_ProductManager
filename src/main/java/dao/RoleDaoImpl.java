package dao;

import model.Role;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by MyPC on 6/4/2017.
 */
public class RoleDaoImpl implements RoleDao {

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

    public Role getRole(int id) {
        Role role = null;
        try {
            getSession().beginTransaction();
            role = (Role) getSession().get(Role.class,id);
            getSession().getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
        }
        return role;
    }

    public List<Role> getAllRole() {
        List<Role> roleList = null;
        try {
            getSession().beginTransaction();
            roleList = getSession().createCriteria(Role.class).list();
            getSession().getTransaction().commit();

        }catch (Exception e){
            e.printStackTrace();
        }
        return roleList;
    }
}
