/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parrot;

/**
 *
 * @author NGUYEN DUC VIET
 */
public class Parrot extends one.Bird{

    Parrot(){
        k++;
    }
    public static void main(String[] args) {
        System.out.println("Bf: " + k);
        Parrot x = new Parrot();
        System.out.println("At: " + k);
        x.fly();
    }
    
}
