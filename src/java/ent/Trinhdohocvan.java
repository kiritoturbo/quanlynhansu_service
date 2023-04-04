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
@Table(name = "trinhdohocvan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Trinhdohocvan.findAll", query = "SELECT t FROM Trinhdohocvan t")
    , @NamedQuery(name = "Trinhdohocvan.findByMaTdhv", query = "SELECT t FROM Trinhdohocvan t WHERE t.maTdhv = :maTdhv")
    , @NamedQuery(name = "Trinhdohocvan.findByTenTdhv", query = "SELECT t FROM Trinhdohocvan t WHERE t.tenTdhv = :tenTdhv")
    , @NamedQuery(name = "Trinhdohocvan.findByNgonngu", query = "SELECT t FROM Trinhdohocvan t WHERE t.ngonngu = :ngonngu")})
public class Trinhdohocvan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ma_tdhv")
    private String maTdhv;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ten_tdhv")
    private String tenTdhv;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ngonngu")
    private String ngonngu;

    public Trinhdohocvan() {
    }

    public Trinhdohocvan(String maTdhv) {
        this.maTdhv = maTdhv;
    }

    public Trinhdohocvan(String maTdhv, String tenTdhv, String ngonngu) {
        this.maTdhv = maTdhv;
        this.tenTdhv = tenTdhv;
        this.ngonngu = ngonngu;
    }

    public String getMaTdhv() {
        return maTdhv;
    }

    public void setMaTdhv(String maTdhv) {
        this.maTdhv = maTdhv;
    }

    public String getTenTdhv() {
        return tenTdhv;
    }

    public void setTenTdhv(String tenTdhv) {
        this.tenTdhv = tenTdhv;
    }

    public String getNgonngu() {
        return ngonngu;
    }

    public void setNgonngu(String ngonngu) {
        this.ngonngu = ngonngu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maTdhv != null ? maTdhv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trinhdohocvan)) {
            return false;
        }
        Trinhdohocvan other = (Trinhdohocvan) object;
        if ((this.maTdhv == null && other.maTdhv != null) || (this.maTdhv != null && !this.maTdhv.equals(other.maTdhv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ent.Trinhdohocvan[ maTdhv=" + maTdhv + " ]";
    }
    
}
