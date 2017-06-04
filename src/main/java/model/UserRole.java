package model;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by MyPC on 6/4/2017.
 */
@Entity
@Table(name = "user_roles")
public class UserRole implements Serializable {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private UserRoleId id;

    @Column(name = "note")
    @NotNull
    private String note;

    public UserRole(){
    }

    public UserRole(UserRoleId id, String note){
        this.id = id;
        this.note = note;
    }

    public UserRoleId getId() {
        return id;
    }

    public void setId(UserRoleId id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
