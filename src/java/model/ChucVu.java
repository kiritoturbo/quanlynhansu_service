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
public class ChucVu {
    String machucvu,tenchucvu,ghichu;

    public ChucVu() {
    }

    public ChucVu(String machucvu, String tenchucvu, String ghichu) {
        this.machucvu = machucvu;
        this.tenchucvu = tenchucvu;
        this.ghichu = ghichu;
    }

    public String getMachucvu() {
        return machucvu;
    }

    public void setMachucvu(String machucvu) {
        this.machucvu = machucvu;
    }

    public String getTenchucvu() {
        return tenchucvu;
    }

    public void setTenchucvu(String tenchucvu) {
        this.tenchucvu = tenchucvu;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }
   
    
   
    
}
