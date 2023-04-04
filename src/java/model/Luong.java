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
public class Luong {
    String manhanvien,tennhanvien;
    double songaylam,thuong,tongtien;
    int luongcapbac;

    public Luong() {
    }

    public Luong(String manhanvien, String tennhanvien, int luongcapbac, double songaylam, double thuong, double tongtien) {
        this.manhanvien = manhanvien;
        this.tennhanvien = tennhanvien;
        this.luongcapbac = luongcapbac;
        this.songaylam = songaylam;
        this.thuong = thuong;
        this.tongtien = tongtien;
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

    public double getLuongcapbac() {
        return luongcapbac;
    }

    public void setLuongcapbac(int luongcapbac) {
        this.luongcapbac = luongcapbac;
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

    public double getTongtien() {
        return tongtien;
    }

    public void setTongtien(double tongtien) {
        this.tongtien = tongtien;
    }

    
    
}
