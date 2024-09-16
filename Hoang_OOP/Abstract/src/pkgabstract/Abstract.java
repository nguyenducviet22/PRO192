package pkgabstract;

import data.Rectangle;
import data.Round;
import data.Shape;
import data.Square;
import data.Triangle;

public class Abstract {

    public static void main(String[] args) {
//        createShapes();
        sortShapes();
    }

    public static void sortShapes() {
        Rectangle rec = new Rectangle("Dad", "Blue", 5, 6);
        Shape recSh = new Rectangle("Mom", "Gray", 2, 4);

        Square sq = new Square("Me", "Pink", 5);
        Rectangle sqRec = new Square("Me too", "Purple", 3);
        Shape sqSh = new Square("Me three", "Yellow", 4);

        Round r = new Round("Bro", "black", 5);
        Shape rSh = new Round("Sid", "Red", 4);

        Triangle tri = new Triangle("Ant", "Green", 3, 4, 5);
        Shape triSh = new Triangle("Uncle", "Orange", 4, 5, 6);

        Shape[] box = new Shape[]{rec, recSh, sq, sqRec, sqSh, r, rSh, tri, triSh};
        for (Shape shape : box) {
            shape.showInfo();
        }
        
        System.out.println("Sorting Area: ");
        for (int i = 0; i < box.length - 1; i++) {
            for (int j = i + 1; j < box.length; j++) {
                if (box[i].getArea() > box[j].getArea()) {
                    Shape tem = box[i];
                    box[i] = box[j];
                    box[j] = tem;
                }
            }
        }
        for (Shape shape : box) {
            shape.showInfo();
        }
    }

    public static void createShapes() {
        Rectangle rec = new Rectangle("Dad", "Blue", 5, 6);
        Shape recSh = new Rectangle("Mom", "Gray", 2, 4);
        Round r = new Round("Bro", "black", 5);
        Shape rSh = new Round("Sid", "Red", 4);

        rec.showInfo();
        recSh.showInfo();
        r.showInfo();
        rSh.showInfo();
    }
}
