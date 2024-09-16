public class Square extends Rectangle {
    
    public Square(double side) {
        super(side, side);
    }
    
    @Override
    public void printInfo() {
        System.out.printf("%-10s|%4.1f|%4.1f|%7.2f|%7.2f|\n",
                "Square", length, length, getArea(), getPerimeter());
    }
}
