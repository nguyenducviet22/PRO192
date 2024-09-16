/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testq46;

/**
 *
 * @author NGUYEN DUC VIET
 */
class Animal {

}

class Mammal extends Animal {

}

class Dog extends Mammal {

}

public class TestQ46 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dog rover, fido;
        Animal ani;

        rover = new Dog();
        ani = rover;
        fido = (Dog) ani;
    }
}
