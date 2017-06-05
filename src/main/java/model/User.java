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

    @Column(name = "full_name")
    @NotNull
    private String fullname;

    @Column(name = "gender")
    private String gender;

    @Column(name = "birthday")
    private String birthday;

    public User() {
    }


    public User(String userName) {
        this.userName = userName;
    }
    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public User(String password, String fullname, String gender, String birthday) {
        this.password = password;
        this.fullname = fullname;
        this.gender = gender;
        this.birthday = birthday;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
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
