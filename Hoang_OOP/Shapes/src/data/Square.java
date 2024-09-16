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
public class Square extends Rectangle {
    
    public Square(String name, String color, double side) {
        super(name, color, side, side);
    }
    
    @Override
    public void showInfo() {
        System.out.printf("|%-10s|%-10s|%-10s|%4.1f| -- |%7.2f|%7.2f|\n",
                            "Square", name, color, a, getArea(), getPerimetive());
    }
}
