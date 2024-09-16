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

    public Square(String owner, String color, double side) {
        super(owner, color, side, side);
    }
    
    @Override
    public void showInfo() {
        System.out.printf("|Square    |%-8s|%-8s|%4.1f| -- |%7.2f|\n",
                owner, color, width, getArea());
    }

}
