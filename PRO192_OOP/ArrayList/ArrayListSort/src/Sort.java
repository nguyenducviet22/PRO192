import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {

    public int age;

    public void sort1(List<Sort> t) {
        t.sort(new Comparator<Sort>() {
            @Override
            public int compare(Sort o1, Sort o2) {
                if (o1.age > o2.age) {
                    return 1;
                } else if (o1.age == o2.age) {
                    return 0;
                } else {
                    return -1;
                }
            }
        });
    }

public void sort2(List<Sort> t) {
Collections.sort(t, new Comparator<Sort>(){
            @Override
            public int compare(Sort o1, Sort o2) {
                if (o1.age > o2.age) {
                    return 1;
                } else if (o1.age == o2.age) {
                    return 0;
                } else {
                    return -1;
                }
            }
        });    
    }
}
