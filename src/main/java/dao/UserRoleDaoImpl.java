package dao;

import model.UserRole;
import model.UserRoleId;

import java.util.List;

import static utils.HibernateUtil.getSession;

/**
 * Created by MyPC on 6/4/2017.
 */
public class UserRoleDaoImpl implements UserRoleDao {


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
