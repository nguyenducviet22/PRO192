/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q41;

/**
 *
 * @author NGUYEN DUC VIET
 */
interface Washer{}
class Animal{}
class Mammal extends Animal{}
class Cat extends Mammal implements Washer{}
class Swamp extends Mammal{}
public class Q41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cat c;
        Washer w;
        Swamp s;
        
        c = new Cat();
        w = c;
        st = (Swamp) w;
    }
}
