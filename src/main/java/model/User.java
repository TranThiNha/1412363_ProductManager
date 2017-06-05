package model;

import com.sun.istack.internal.NotNull;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by MyPC on 6/4/2017.
 */
@Entity
@Table(name = "user")
public class User implements Serializable{
    @Id
    @Column(name = "user_name")
    @GenericGenerator(name="gen",strategy="increment")
    @GeneratedValue(generator="gen")
    private String userName;

    @Column(name = "password")
    @NotNull
    private String password;

    public User() {
    }


    public User(String userName) {
        this.userName = userName;
    }
    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }




}
