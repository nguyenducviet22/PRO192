package data;

public class Rectangle extends Shape {
    protected double a, b;

    public Rectangle(String name, String color, double a, double b) {
        super(name, color);
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPerimetive() {
        return 2 * (a + b);
    }

    @Override
    public void showInfo() {
        System.out.printf("|Rectangle |%-10s|%-10s|%4.1f|%4.1f|%7.2f|%7.2f|\n",
                name, color, a, b, getArea(), getPerimetive());
    }
    
    
}
