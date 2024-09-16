
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
public class MySpeaker implements ISpeaker {

    @Override
    public int f1(List<Speaker> t) {
        int count = 0;
        for (Speaker speaker : t) {
            if (speaker.getPower() > 10) {
                count++;
            }
        }
        return count;
    }

    @Override
    public void f2(List<Speaker> t) {
        t.subList(0, 5).sort(new Comparator<Speaker>() {
            @Override
            public int compare(Speaker o1, Speaker o2) {
                if (o1.getPower() > o2.getPower()) {
                    return 1;
                } else if (o1.getPower() < o2.getPower()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
    }

    @Override
    public void f3(List<Speaker> t) {
        int min = t.get(0).getPower();
        int count = 0;
        for (int i = 1; i < t.size(); i++) {
            if (min >= t.get(i).getPower()) {
                min = t.get(i).getPower();
                count++;
            }
            if (count > 1) {
                t.remove(i);
            }
        }
    }
}
