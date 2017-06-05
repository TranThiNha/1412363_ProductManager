package dao;


import model.User;

import java.util.List;

/**
 * Created by MyPC on 6/4/2017.
 */
public interface UserDao {
    public User getUser(String username);
    public List<User> getAllUser();
}
