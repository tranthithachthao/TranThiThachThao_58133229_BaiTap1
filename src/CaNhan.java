/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public abstract class CaNhan {
    String ho;
    String ten;
    int tuoi;
    String diaChi;

    public CaNhan() {
    }


    public CaNhan(String ho, String ten, int tuoi, String diaChi) {
        this.ho = ho;
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiachi() {
        return diaChi;
    }

    public void setDiachi(String diaChi) {
        this.diaChi = diaChi;
    }
    public String HienThiTT(){
        return "Ho: " + ho + "\n"
                +"Ten: "+ ten + "\n"
                +"Tuoi: "+ tuoi + "\n"
                +"Dia Chi: " + diaChi + "\n";
    }
}