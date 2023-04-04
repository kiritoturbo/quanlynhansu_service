/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ent;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author MANH TRUONG
 */
@Entity
@Table(name = "nhanvien")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nhanvien.findAll", query = "SELECT n FROM Nhanvien n")
    , @NamedQuery(name = "Nhanvien.findByMaNv", query = "SELECT n FROM Nhanvien n WHERE n.maNv = :maNv")
    , @NamedQuery(name = "Nhanvien.findByTenNv", query = "SELECT n FROM Nhanvien n WHERE n.tenNv = :tenNv")
    , @NamedQuery(name = "Nhanvien.findByPhongban", query = "SELECT n FROM Nhanvien n WHERE n.phongban = :phongban")
    , @NamedQuery(name = "Nhanvien.findByChucvu", query = "SELECT n FROM Nhanvien n WHERE n.chucvu = :chucvu")
    , @NamedQuery(name = "Nhanvien.findByTdHocvan", query = "SELECT n FROM Nhanvien n WHERE n.tdHocvan = :tdHocvan")
    , @NamedQuery(name = "Nhanvien.findByChuyenmon", query = "SELECT n FROM Nhanvien n WHERE n.chuyenmon = :chuyenmon")
    , @NamedQuery(name = "Nhanvien.findByNgaysinh", query = "SELECT n FROM Nhanvien n WHERE n.ngaysinh = :ngaysinh")
    , @NamedQuery(name = "Nhanvien.findByGioitinh", query = "SELECT n FROM Nhanvien n WHERE n.gioitinh = :gioitinh")
    , @NamedQuery(name = "Nhanvien.findByDiachi", query = "SELECT n FROM Nhanvien n WHERE n.diachi = :diachi")
    , @NamedQuery(name = "Nhanvien.findBySdt", query = "SELECT n FROM Nhanvien n WHERE n.sdt = :sdt")
    , @NamedQuery(name = "Nhanvien.findByEmail", query = "SELECT n FROM Nhanvien n WHERE n.email = :email")})
public class Nhanvien implements Serializable {

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
    @Size(min = 1, max = 50)
    @Column(name = "phongban")
    private String phongban;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "chucvu")
    private String chucvu;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "td_hocvan")
    private String tdHocvan;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "chuyenmon")
    private String chuyenmon;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ngaysinh")
    @Temporal(TemporalType.DATE)
    private Date ngaysinh;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "gioitinh")
    private String gioitinh;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "diachi")
    private String diachi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "sdt")
    private String sdt;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "email")
    private String email;

    public Nhanvien() {
    }

    public Nhanvien(String maNv) {
        this.maNv = maNv;
    }

    public Nhanvien(String maNv, String tenNv, String phongban, String chucvu, String tdHocvan, String chuyenmon, Date ngaysinh, String gioitinh, String diachi, String sdt, String email) {
        this.maNv = maNv;
        this.tenNv = tenNv;
        this.phongban = phongban;
        this.chucvu = chucvu;
        this.tdHocvan = tdHocvan;
        this.chuyenmon = chuyenmon;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.sdt = sdt;
        this.email = email;
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

    public String getPhongban() {
        return phongban;
    }

    public void setPhongban(String phongban) {
        this.phongban = phongban;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public String getTdHocvan() {
        return tdHocvan;
    }

    public void setTdHocvan(String tdHocvan) {
        this.tdHocvan = tdHocvan;
    }

    public String getChuyenmon() {
        return chuyenmon;
    }

    public void setChuyenmon(String chuyenmon) {
        this.chuyenmon = chuyenmon;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        if (!(object instanceof Nhanvien)) {
            return false;
        }
        Nhanvien other = (Nhanvien) object;
        if ((this.maNv == null && other.maNv != null) || (this.maNv != null && !this.maNv.equals(other.maNv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ent.Nhanvien[ maNv=" + maNv + " ]";
    }
    
}
