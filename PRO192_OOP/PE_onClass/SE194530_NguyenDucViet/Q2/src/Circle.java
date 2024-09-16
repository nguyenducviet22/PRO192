
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NGUYEN DUC VIET
 */
public class Circle extends Shape {

    private double radius;

    public Circle() {
    }

    public Circle(double value) {
        this.radius = value;
    }

    public void calculateArea() {
        super.setArea(Math.pow(radius, 2) * Math.PI);
    }

    public void calculatePerimeter() {
        super.setPerimeter(2 * radius * Math.PI);

    }

    @Override
    public String toString() {
        calculateArea();
        calculatePerimeter();
        return String.format("%.2f,%.2f", super.getPerimeter(), super.getArea());
    }
}
