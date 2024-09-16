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
public class Round {

    private String owner;
    private String color;
    private double radius;

    public Round(String owner, String color, double radius) {
        this.owner = owner;
        this.color = color;
        this.radius = radius;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Round{" + "owner=" + owner + ", color=" + color + ", radius=" + radius + '}';
    }

    public void showInfo() {
        System.out.printf("|Round     |%-8s|%-8s|%4.1f| -- |%7.2f|\n",
                owner, color, radius, getArea());
    }

    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

}
