/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MANH TRUONG
 */
public class Dangnhap {
    String username,password,email;
    List<ChucVu> Chucvu;
    List<Chuyenmon> Chuyenmon;
    List<Luong> Luong;
    List<Nhanvien> Nhanvien;
    List<Phongban> Phongban;
    List<Trinhdohocvan> Trinhdohocvan;

    public Dangnhap() {
        Chucvu=new ArrayList<>();
        Chuyenmon=new ArrayList<>();
        Luong=new ArrayList<>();
        Nhanvien=new ArrayList<>();
        Phongban=new ArrayList<>();
        Trinhdohocvan=new ArrayList<>();
    }

    public Dangnhap(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
        
        Chucvu=new ArrayList<>();
        Chuyenmon=new ArrayList<>();
        Luong=new ArrayList<>();
        Nhanvien=new ArrayList<>();
        Phongban=new ArrayList<>();
        Trinhdohocvan=new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
