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
public class RightTriangle extends Triangle {
    
    public RightTriangle(String owner, String color, double a, double b) {
        super(owner, color, a, b, Math.sqrt(a * a + b * b));
    }
    
    @Override
    public void showInfo() {
        System.out.printf("|R.Triangle|%-8s|%-8s|%4.1f|%4.1f| -- |%7.2f|\n",
                owner, color, a, b, getArea());
    }
}
