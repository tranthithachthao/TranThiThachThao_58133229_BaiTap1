/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class HocSinh extends CaNhan{
    String lop;
    String nangKhieu;
    
    
    public HocSinh(String lop, String nangKhieu, String ho, String ten, int tuoi, String diaChi) {
        super(ho, ten, tuoi, diaChi);
        this.lop = lop;
        this.nangKhieu = nangKhieu;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNangKhieu() {
        return nangKhieu;
    }

    public void setNangKhieu(String nangKhieu) {
        this.nangKhieu = nangKhieu;
    }

    @Override
    public String HienThiTT() {
        return super.HienThiTT()
                +"Lop: " + lop + "\n"
                + "Nang Khieu: "+ nangKhieu +"\n"; //To change body of generated methods, choose Tools | Templates.
    }
    
}