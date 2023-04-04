/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author MANH TRUONG
 */
public class Trinhdohocvan {
    String ma_tdhv,ten_tdhv,ngonngu;

    public Trinhdohocvan() {
    }

    public Trinhdohocvan(String ma_tdhv, String ten_tdhv, String ngonngu) {
        this.ma_tdhv = ma_tdhv;
        this.ten_tdhv = ten_tdhv;
        this.ngonngu = ngonngu;
    }

    public String getMa_tdhv() {
        return ma_tdhv;
    }

    public void setMa_tdhv(String ma_tdhv) {
        this.ma_tdhv = ma_tdhv;
    }

    public String getTen_tdhv() {
        return ten_tdhv;
    }

    public void setTen_tdhv(String ten_tdhv) {
        this.ten_tdhv = ten_tdhv;
    }

    public String getNgonngu() {
        return ngonngu;
    }

    public void setNgonngu(String ngonngu) {
        this.ngonngu = ngonngu;
    }
    
    

   
    
}
