package model;

import com.sun.istack.internal.NotNull;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by MyPC on 6/4/2017.
 */
public class UserRoleId implements Serializable {

    @Column(name = "username")
    private String username;

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "role_id")
    private int roleId;

    public UserRoleId() {
    }

    public UserRoleId(String username, int roleId) {
        this.username = username;
        this.roleId = roleId;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public int getRoleId() {
        return this.roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }


    public boolean equals(Object other) {
        if ( (this == other ) ) return true;
        if ( (other == null ) ) return false;
        if ( !(other instanceof UserRoleId) ) return false;
        UserRoleId castOther = ( UserRoleId ) other;

        return ( (this.getUsername()==castOther.getUsername()) || ( this.getUsername()!=null && castOther.getUsername()!=null && this.getUsername().equals(castOther.getUsername()) ) )
                && (this.getRoleId()==castOther.getRoleId());
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + ( getUsername() == null ? 0 : this.getUsername().hashCode() );
        result = 37 * result + this.getRoleId();
        return result;
    }


}
