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
public class Phongban {
    String ma_pb,ten_pb;
    int sdt;

    public Phongban() {
    }

    public Phongban(String ma_pb, String ten_pb, int sdt) {
        this.ma_pb = ma_pb;
        this.ten_pb = ten_pb;
        this.sdt = sdt;
    }

    public String getMa_pb() {
        return ma_pb;
    }

    public void setMa_pb(String ma_pb) {
        this.ma_pb = ma_pb;
    }

    public String getTen_pb() {
        return ten_pb;
    }

    public void setTen_pb(String ten_pb) {
        this.ten_pb = ten_pb;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }
    
}
