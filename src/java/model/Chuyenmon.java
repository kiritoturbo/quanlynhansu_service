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
public class Chuyenmon {
    String machuyenmon,tenchuyenmon;

    public Chuyenmon() {
    }

    public Chuyenmon(String machuyenmon, String tenchuyenmon) {
        this.machuyenmon = machuyenmon;
        this.tenchuyenmon = tenchuyenmon;
    }

    public String getMachuyenmon() {
        return machuyenmon;
    }

    public void setMachuyenmon(String machuyenmon) {
        this.machuyenmon = machuyenmon;
    }

    public String getTenchuyenmon() {
        return tenchuyenmon;
    }

    public void setTenchuyenmon(String tenchuyenmon) {
        this.tenchuyenmon = tenchuyenmon;
    }
    
}
