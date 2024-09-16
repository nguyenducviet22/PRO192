
import java.util.Comparator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author NGUYEN DUC VIET
 */
public class MyCala implements ICala {

    @Override
    public int f1(List<Cala> t) {
        int count = 0;
        for (Cala cala : t) {
            char c[] = cala.getOwner().toCharArray();
            if (Character.isDigit(c[1])) {
                count++;
            }
        }
        return count;
    }

    @Override
    public void f2(List<Cala> t) {
        int mprice = t.get(0).getPrice();
        int count = 0;
        for (Cala cala : t) {
            if (mprice < cala.getPrice()) {
                mprice = cala.getPrice();
            }
        }
        for (Cala cala : t) {
            if (cala.getPrice() == mprice) {
                count++;
            }
            if (count>1){
                t.remove(cala);
                break;
            }
            
        }
    }

    @Override
    public void f3(List<Cala> t) {
        t.sort(new Comparator<Cala>() {
            @Override
            public int compare(Cala o1, Cala o2) {
                if (o1.getOwner().charAt(1) > o2.getOwner().charAt(1)){
                    return 1;
                } else if (o1.getOwner().charAt(1) < o2.getOwner().charAt(1)){
                    return -1;
                } else {
                    return 0;
                }
            }
        });
    }

}
