
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
            if (cala.getPrice() % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    @Override
    public void f2(List<Cala> t) {
        int count = 0;
        int min = t.get(0).getPrice();
        for (int i = 0; i < t.size(); i++) {
            if (min > t.get(i).getPrice()) {
                min = t.get(i).getPrice();
            }
        }
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getPrice() == min) {
                if (count > 0) {
                    t.remove(i);
                }
                count++;
            }
        }
    }

    @Override
    public void f3(List<Cala> t) {
        t.sort(new Comparator<Cala>() {
            @Override
            public int compare(Cala o1, Cala o2) {
                if (o1.getOwner().charAt(0) > o2.getOwner().charAt(0)) {
                    return -1;
                } else if (o1.getOwner().charAt(0) < o2.getOwner().charAt(0)) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
    }

}
