
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
public class MyPen implements IPen {

    @Override
    public int f1(List<Pen> t) {
        int total = 0;
        int count = 0;
        for (int i = 0; i < t.size(); i++) {
            char[] chars = t.get(i).getName().toCharArray();
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == 'A') {
                    count++;
                }
            }
            if (count >= 2) {
                total++;
            }
            count = 0;
        }

        return total;
    }

    @Override
    public void f2(List<Pen> t) {
        Pen minPen = t.get(0);
        for (Pen pen : t) {
            if (pen.getPrice() % 2 != 0
                    && pen.getPrice() < minPen.getPrice()) {
                minPen = pen;
            }
        }
        t.remove(minPen);
    }

    @Override
    public void f3(List<Pen> t) {
        t.subList(2, t.size() - 1).sort(new Comparator<Pen>() {
            @Override
            public int compare(Pen o1, Pen o2) {
                if (o1.getName().charAt(0) > o2.getName().charAt(0)) {
                    return 1;
                } else if (o1.getName().charAt(0) < o2.getName().charAt(0)) {
                    return -1;
                } else {
                    if (o1.getPrice() < o2.getPrice()) {
                        return 1;
                    } else if (o1.getPrice() > o2.getPrice()) {
                        return -1;
                    } else {
                        return 0;
                    }

                }
            }
        });
    }

}
