/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ent;

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
 * @author MANH TRUONG
 */
@Entity
@Table(name = "chuyenmon")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Chuyenmon.findAll", query = "SELECT c FROM Chuyenmon c")
    , @NamedQuery(name = "Chuyenmon.findByMaCm", query = "SELECT c FROM Chuyenmon c WHERE c.maCm = :maCm")
    , @NamedQuery(name = "Chuyenmon.findByTenCm", query = "SELECT c FROM Chuyenmon c WHERE c.tenCm = :tenCm")})
public class Chuyenmon implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ma_cm")
    private String maCm;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ten_cm")
    private String tenCm;

    public Chuyenmon() {
    }

    public Chuyenmon(String maCm) {
        this.maCm = maCm;
    }

    public Chuyenmon(String maCm, String tenCm) {
        this.maCm = maCm;
        this.tenCm = tenCm;
    }

    public String getMaCm() {
        return maCm;
    }

    public void setMaCm(String maCm) {
        this.maCm = maCm;
    }

    public String getTenCm() {
        return tenCm;
    }

    public void setTenCm(String tenCm) {
        this.tenCm = tenCm;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maCm != null ? maCm.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Chuyenmon)) {
            return false;
        }
        Chuyenmon other = (Chuyenmon) object;
        if ((this.maCm == null && other.maCm != null) || (this.maCm != null && !this.maCm.equals(other.maCm))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ent.Chuyenmon[ maCm=" + maCm + " ]";
    }
    
}
