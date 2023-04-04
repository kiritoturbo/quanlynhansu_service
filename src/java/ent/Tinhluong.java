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
@Table(name = "tinhluong")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tinhluong.findAll", query = "SELECT t FROM Tinhluong t")
    , @NamedQuery(name = "Tinhluong.findByMaNv", query = "SELECT t FROM Tinhluong t WHERE t.maNv = :maNv")
    , @NamedQuery(name = "Tinhluong.findByTenNv", query = "SELECT t FROM Tinhluong t WHERE t.tenNv = :tenNv")
    , @NamedQuery(name = "Tinhluong.findByLuongCb", query = "SELECT t FROM Tinhluong t WHERE t.luongCb = :luongCb")
    , @NamedQuery(name = "Tinhluong.findBySongaylam", query = "SELECT t FROM Tinhluong t WHERE t.songaylam = :songaylam")
    , @NamedQuery(name = "Tinhluong.findByThuong", query = "SELECT t FROM Tinhluong t WHERE t.thuong = :thuong")
    , @NamedQuery(name = "Tinhluong.findByTongTien", query = "SELECT t FROM Tinhluong t WHERE t.tongTien = :tongTien")})
public class Tinhluong implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ma_nv")
    private String maNv;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ten_nv")
    private String tenNv;
    @Basic(optional = false)
    @NotNull
    @Column(name = "luong_cb")
    private int luongCb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "songaylam")
    private double songaylam;
    @Basic(optional = false)
    @NotNull
    @Column(name = "thuong")
    private double thuong;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tong_tien")
    private double tongTien;

    public Tinhluong() {
    }

    public Tinhluong(String maNv) {
        this.maNv = maNv;
    }

    public Tinhluong(String maNv, String tenNv, int luongCb, double songaylam, double thuong, double tongTien) {
        this.maNv = maNv;
        this.tenNv = tenNv;
        this.luongCb = luongCb;
        this.songaylam = songaylam;
        this.thuong = thuong;
        this.tongTien = tongTien;
    }

    public String getMaNv() {
        return maNv;
    }

    public void setMaNv(String maNv) {
        this.maNv = maNv;
    }

    public String getTenNv() {
        return tenNv;
    }

    public void setTenNv(String tenNv) {
        this.tenNv = tenNv;
    }

    public int getLuongCb() {
        return luongCb;
    }

    public void setLuongCb(int luongCb) {
        this.luongCb = luongCb;
    }

    public double getSongaylam() {
        return songaylam;
    }

    public void setSongaylam(double songaylam) {
        this.songaylam = songaylam;
    }

    public double getThuong() {
        return thuong;
    }

    public void setThuong(double thuong) {
        this.thuong = thuong;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maNv != null ? maNv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tinhluong)) {
            return false;
        }
        Tinhluong other = (Tinhluong) object;
        if ((this.maNv == null && other.maNv != null) || (this.maNv != null && !this.maNv.equals(other.maNv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ent.Tinhluong[ maNv=" + maNv + " ]";
    }
    
}
