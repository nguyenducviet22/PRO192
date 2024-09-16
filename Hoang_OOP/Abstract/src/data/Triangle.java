/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author NGUYEN DUC VIET
 */
public class Triangle extends Shape {

    protected double a, b, c;

    public Triangle(String name, String color, double a, double b, double c) {
        super(name, color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double p = getPerimiter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double getPerimiter() {
        return a + b + c;
    }

    @Override
    public void showInfo() {
        System.out.printf("|Triangle  |%-10s|%-10s|%4.1f|%4.1f|%4.1f|%7.2f|%7.2f|\n",
                name, color, a, b, c, getArea(), getPerimiter());
    }

}
