package shapes;

import data.*;

public class Shapes {

    public static void main(String[] args) {
        sortShapes();
//        createAnonymousClass();
    }

    public static void createAnonymousClass() {
        Shape uniqueSh = new Shape("Bro", "Orange") {
            @Override
            public double getArea() {
                return 50;
            }

            @Override
            public double getPerimetive() {
                return 30;
            }

            @Override
            public void showInfo() {
                System.out.printf("|%-10s|%-10s|%-10s| -- | -- |%7.2f|%7.2f|\n",
                        "Unique", name, color, getArea(), getPerimetive());
            }
        };
        uniqueSh.showInfo();
    }

    public static void sortShapes() {

        Shape strangeSh = new Shape("Sis", "Yellow") {
            @Override
            public double getArea() {
                return 50;
            }

            @Override
            public double getPerimetive() {
                return 30;
            }

            @Override
            public void showInfo() {
                System.out.printf("|%-10s|%-10s|%-10s| -- | -- |%7.2f|%7.2f|\n",
                        "Strange", name, color, getArea(), getPerimetive());
            }
        };

        Rectangle rec = new Rectangle("Dad", "Black", 2, 3);
        Shape recSh = new Rectangle("Dad", "Red", 3, 4);
        Square sq = new Square("Mom", "Blue", 3);
        Rectangle sqRec = new Square("Mom", "Pink", 3.5);
        Shape sqSh = new Square("Mom", "Green", 4);
        Round r = new Round("Me", "Purple", 2);
        Shape rSh = new Round("Me", "Red", 5);

        Shape shape[] = new Shape[]{rec, recSh, sq, sqRec, sqSh, r, rSh, strangeSh};
        for (int i = 0; i < shape.length - 1; i++) {
            for (int j = i + 1; j < shape.length; j++) {
                if (shape[i].getArea() > shape[j].getArea()) {
                    Shape tem = shape[i];
                    shape[i] = shape[j];
                    shape[j] = tem;
                }
            }
        }
        for (Shape s : shape) {
            s.showInfo();
        }
    }
}
