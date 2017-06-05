package model;

import com.sun.istack.internal.NotNull;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by MyPC on 6/4/2017.
 */
@Entity
@Table(name = "role")
public class Role implements Serializable{
    @Id
    @Column(name = "id")
    @GenericGenerator(name="gen",strategy="increment")
    @GeneratedValue(generator="gen")
    private int id;

    @Column(name = "role_name")
    @NotNull
    private String roleName;

    public Role() {
    }


    public Role(int id) {
        this.id = id;
    }
    public Role(int id, String roleName) {
        this.id = id;
        this.roleName = roleName;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
