/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author MANH TRUONG
 */
public class Nhanvien {
    String manhanvien,tennhanvien,phongban,chucvu,trinhdohocvan,gioitinh,diachi,sdt,email;
    Date ngaysinh;

    public Nhanvien() {
    }

    public Nhanvien(String manhanvien, String tennhanvien, String phongban, String chucvu, String trinhdohocvan, String gioitinh, String diachi, String sdt, String email, Date ngaysinh) {
        this.manhanvien = manhanvien;
        this.tennhanvien = tennhanvien;
        this.phongban = phongban;
        this.chucvu = chucvu;
        this.trinhdohocvan = trinhdohocvan;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.sdt = sdt;
        this.email = email;
        this.ngaysinh = ngaysinh;
    }

    public String getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(String manhanvien) {
        this.manhanvien = manhanvien;
    }

    public String getTennhanvien() {
        return tennhanvien;
    }

    public void setTennhanvien(String tennhanvien) {
        this.tennhanvien = tennhanvien;
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

    public String getTrinhdohocvan() {
        return trinhdohocvan;
    }

    public void setTrinhdohocvan(String trinhdohocvan) {
        this.trinhdohocvan = trinhdohocvan;
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

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }
    
    

   
}
