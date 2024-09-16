public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "length=" + length + ", width=" + width + '}';
    }
    
    public double getArea() {
        return length * width;
    }
    
    public double getPerimeter() {
        return 2 * (length + width);
    }

public void printInfo() {
    System.out.printf("|%-10s|%4.1f|%4.1f|%7.2f|%7.2f|\n",
                        "Rectangle", length, width, getArea(),getPerimeter());
}    
    
}
