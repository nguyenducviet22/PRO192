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
public class Round extends Shape {

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
        return Round.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimetive() {
        return 2 * Round.PI * radius;
    }

    @Override
    public void showInfo() {
        System.out.printf("|Round     |%-10s|%-10s|%4.1f| -- |%7.2f|%7.2f|\n",
                name, color, radius, getArea(), getPerimetive());
    }

}
