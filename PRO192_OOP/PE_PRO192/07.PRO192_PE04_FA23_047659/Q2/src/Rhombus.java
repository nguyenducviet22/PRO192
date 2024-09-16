/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NGUYEN DUC VIET
 */
public class Rhombus extends Shape {

    private double diagonal01;
    private double diagonal02;
    private double side;

    public Rhombus() {
    }

    public Rhombus(String name, double diagonal01, double diagonal02, double side) {
        super(name);
        this.diagonal01 = diagonal01;
        this.diagonal02 = diagonal02;
        this.side = side;
    }

    @Override
    public double calculateArea() {
        double s = (diagonal01 * diagonal02) / 2;
        return s;
    }

    @Override
    public double calculatePerimeter() {
        double p = side * 4;
        return p;
    }

    @Override
    public String toString() {
        return String.format("%s,%.2f,%.2f,%.2f", getName(), diagonal01, diagonal02, side);
    }

}
