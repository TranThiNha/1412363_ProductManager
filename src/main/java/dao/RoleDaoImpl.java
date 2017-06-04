package dao;

import model.Role;
import utils.HibernateUtil;

import java.util.List;

import static utils.HibernateUtil.getSession;

/**
 * Created by MyPC on 6/4/2017.
 */
public class RoleDaoImpl implements RoleDao {
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
