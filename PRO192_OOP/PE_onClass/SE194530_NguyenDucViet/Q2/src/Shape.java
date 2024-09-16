/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NGUYEN DUC VIET
 */
public class Shape {
    protected double perimeter;
    protected double area;

    public Shape() {
        this.perimeter = 0;
        this.area = 0;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double value) {
        this.perimeter = value;
    }

//    public String getArea() {
//        return String.format("%.2f", area);
//    }
    
    public double getArea() {
        return area;
    }

    public void setArea(double value) {
        this.area = value;
    }
}
