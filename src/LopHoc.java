
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class LopHoc {
     ArrayList<HocSinh> s = new ArrayList<>();
    ArrayList<GiaoVien> t = new ArrayList<>();
    
    private QLDS ql = new QLDS();
    
    public LopHoc() {
    }
    public int themHS(HocSinh hs){ 
        s.add(hs);
        return ql.them(hs);
    }
    
    public int themGVGD(GiaoVien gv){
        t.add(gv);
        return ql.them(gv);
    }
    public void inDSHS(ArrayList<CaNhan> hs){
        for (int i = 0; i< s.size(); i++)
        {
            System.out.println(s.get(i).HienThiTT());
        }
       
    }
    public void inDSGVGD(ArrayList<CaNhan> gv){
           for (int i = 0; i< t.size(); i++)
        {
            System.out.println(t.get(i).HienThiTT());
        }
      
    }

    
}
