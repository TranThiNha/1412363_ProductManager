package dao;

import model.Role;

import java.util.List;

/**
 * Created by MyPC on 6/4/2017.
 */
public interface RoleDao {
    public Role getRole(int id);
    public List<Role> getAllRole();
}
