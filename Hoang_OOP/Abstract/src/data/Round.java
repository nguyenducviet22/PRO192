package data;

public class Round extends Shape{
    public static final double PI = 3.14;
    private double radius;

    public Round(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Round{" + "radius=" + radius + '}';
    }

    @Override
    public double getArea() {
        return Round.PI * radius * radius;
    }

    @Override
    public double getPerimiter() {
        return Round.PI * 2 * radius;
    }

    @Override
    public void showInfo() {
        System.out.printf("|Round     |%-10s|%-10s|%4.1f| -- | -- |%7.2f|%7.2f|\n", 
                name, color, radius, getArea(), getPerimiter());
    }
    
    
}
