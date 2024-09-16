/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main_q38;

/**
 *
 * @author NGUYEN DUC VIET
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Decrementer d = new Decrementer();
        double x = 7.2;
        System.out.println(x + " ");
        d.decre(x);
        System.out.println(x + " ");
    }
    
}

class Decrementer {
    public void decre(double x){
        x = x-2;
        System.out.println(x + " ");
    }
}
