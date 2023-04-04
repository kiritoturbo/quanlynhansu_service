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
@Table(name = "chucvu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Chucvu.findAll", query = "SELECT c FROM Chucvu c")
    , @NamedQuery(name = "Chucvu.findByMaCv", query = "SELECT c FROM Chucvu c WHERE c.maCv = :maCv")
    , @NamedQuery(name = "Chucvu.findByTenCv", query = "SELECT c FROM Chucvu c WHERE c.tenCv = :tenCv")
    , @NamedQuery(name = "Chucvu.findByGhichu", query = "SELECT c FROM Chucvu c WHERE c.ghichu = :ghichu")})
public class Chucvu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ma_cv")
    private String maCv;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ten_cv")
    private String tenCv;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ghichu")
    private String ghichu;

    public Chucvu() {
    }

    public Chucvu(String maCv) {
        this.maCv = maCv;
    }

    public Chucvu(String maCv, String tenCv, String ghichu) {
        this.maCv = maCv;
        this.tenCv = tenCv;
        this.ghichu = ghichu;
    }

    public String getMaCv() {
        return maCv;
    }

    public void setMaCv(String maCv) {
        this.maCv = maCv;
    }

    public String getTenCv() {
        return tenCv;
    }

    public void setTenCv(String tenCv) {
        this.tenCv = tenCv;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maCv != null ? maCv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Chucvu)) {
            return false;
        }
        Chucvu other = (Chucvu) object;
        if ((this.maCv == null && other.maCv != null) || (this.maCv != null && !this.maCv.equals(other.maCv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ent.Chucvu[ maCv=" + maCv + " ]";
    }
    
}
