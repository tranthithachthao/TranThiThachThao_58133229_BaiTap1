
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
public class QLDS implements IQLDS{
    ArrayList<CaNhan> ls = new ArrayList<>();
    @Override
    public int them(CaNhan p) {
         ls.add(p);
        return ls.size();
    }

    @Override
    public int xoa(String ten) {
        for(int i = 0; i < ls.size(); i++){
            if(ten.compareTo(ls.get(i).ten) == 0)
                ls.remove(i);
        }
        return ls.size();
    }

    @Override
    public void inDS(ArrayList<CaNhan> ls) {
        for (int i = 0; i < ls.size(); i++){
            System.out.println(ls.get(i).HienThiTT());
        }
    }
    
}
