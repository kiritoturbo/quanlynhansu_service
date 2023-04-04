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
@Table(name = "phongban")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Phongban.findAll", query = "SELECT p FROM Phongban p")
    , @NamedQuery(name = "Phongban.findByMaPb", query = "SELECT p FROM Phongban p WHERE p.maPb = :maPb")
    , @NamedQuery(name = "Phongban.findByTenPb", query = "SELECT p FROM Phongban p WHERE p.tenPb = :tenPb")
    , @NamedQuery(name = "Phongban.findBySdt", query = "SELECT p FROM Phongban p WHERE p.sdt = :sdt")})
public class Phongban implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ma_pb")
    private String maPb;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ten_pb")
    private String tenPb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sdt")
    private int sdt;

    public Phongban() {
    }

    public Phongban(String maPb) {
        this.maPb = maPb;
    }

    public Phongban(String maPb, String tenPb, int sdt) {
        this.maPb = maPb;
        this.tenPb = tenPb;
        this.sdt = sdt;
    }

    public String getMaPb() {
        return maPb;
    }

    public void setMaPb(String maPb) {
        this.maPb = maPb;
    }

    public String getTenPb() {
        return tenPb;
    }

    public void setTenPb(String tenPb) {
        this.tenPb = tenPb;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maPb != null ? maPb.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Phongban)) {
            return false;
        }
        Phongban other = (Phongban) object;
        if ((this.maPb == null && other.maPb != null) || (this.maPb != null && !this.maPb.equals(other.maPb))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ent.Phongban[ maPb=" + maPb + " ]";
    }
    
}
