
import java.util.List;

public class MyWall implements IWall {

    @Override
    public int f1(List<Wall> t) {
//        int minArea = t.get(0).getArea();
        int minArea = 1000;
        for (int i = 0; i < t.size(); i++) {
            int placeLength = t.get(i).getPlace().length();
            int squareNum = (int) Math.sqrt(placeLength);
            if (squareNum > 1 && squareNum*squareNum == placeLength && minArea > t.get(i).getArea()) {
                minArea = t.get(i).getArea();
            }
        }
        return minArea;
    }

    @Override
    public void f2(List<Wall> t) {
        Wall temp = t.get(3);
        t.set(3, t.get(5));
        t.set(5, temp);
    }

    @Override
    public void f3(List<Wall> t) {
        Wall minWall = t.get(0);
        for (int i = 0; i < t.size(); i++) {
            if (minWall.getArea() > t.get(i).getArea()) {
                minWall = t.get(i);
            }
        }
        t.set(0, minWall);
    }

}
