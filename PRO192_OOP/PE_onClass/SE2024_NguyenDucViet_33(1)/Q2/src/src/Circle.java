public class Circle extends Shape{
    private double radius;
    private String borderColor;

    public Circle() {
    }

    public Circle(String name, String fillColor, double radius, String borderColor) {
        super(name, fillColor);
        this.radius = radius;
        this.borderColor = borderColor;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }
    
    public double calculateArea(){
        return Math.PI * radius * radius;
    }
    
    public double calculatePerimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", %s, %.2f, %.2f", 
                borderColor, calculatePerimeter(), calculateArea());
    } 
}
