/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author GTC
 */
@Entity
@Table(name = "TBL_USERS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblUsers.findAll", query = "SELECT t FROM TblUsers t")
    , @NamedQuery(name = "TblUsers.findByUid", query = "SELECT t FROM TblUsers t WHERE t.uid = :uid")
    , @NamedQuery(name = "TblUsers.findByFirstName", query = "SELECT t FROM TblUsers t WHERE t.firstName = :firstName")
    , @NamedQuery(name = "TblUsers.findByLastName", query = "SELECT t FROM TblUsers t WHERE t.lastName = :lastName")
    , @NamedQuery(name = "TblUsers.findByTp", query = "SELECT t FROM TblUsers t WHERE t.tp = :tp")})
public class TblUsers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "UID")
    private Integer uid;
    @Size(max = 100)
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Size(max = 100)
    @Column(name = "LAST_NAME")
    private String lastName;
    @Size(max = 11)
    @Column(name = "TP")
    private String tp;

    public TblUsers() {
    }

    public TblUsers(Integer uid) {
        this.uid = uid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTp() {
        return tp;
    }

    public void setTp(String tp) {
        this.tp = tp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (uid != null ? uid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblUsers)) {
            return false;
        }
        TblUsers other = (TblUsers) object;
        if ((this.uid == null && other.uid != null) || (this.uid != null && !this.uid.equals(other.uid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TblUsers[ uid=" + uid + " ]";
    }
    
}
