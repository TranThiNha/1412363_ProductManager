package dao;

import model.UserRole;
import model.UserRoleId;

import java.util.List;

/**
 * Created by MyPC on 6/4/2017.
 */
public interface UserRoleDao {
    public UserRole getUserRole(UserRoleId id);
    public List<UserRole>getAllUserRole();
}
