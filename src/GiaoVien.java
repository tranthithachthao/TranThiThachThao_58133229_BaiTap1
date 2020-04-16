/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class GiaoVien extends CaNhan{
    String monDay;
    String toBoMon;

    public GiaoVien(String monDay, String toBoMon, String ho, String ten, int tuoi, String diaChi) {
        super(ho, ten, tuoi, diaChi);
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }

    public String getMonDay() {
        return monDay;
    }

    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    public String getToBoMon() {
        return toBoMon;
    }

    public void setToBoMon(String toBoMon) {
        this.toBoMon = toBoMon;
    }

    @Override
    public String HienThiTT() {
        return super.HienThiTT()
                +"Mon Day: " + monDay + "\n"
                + "To Bo Mon: "+ toBoMon+ "\n"; //To change body of generated methods, choose Tools | Templates.
    }
    
}