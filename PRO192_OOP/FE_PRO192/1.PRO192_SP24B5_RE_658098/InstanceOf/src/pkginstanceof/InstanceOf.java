/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginstanceof;

/**
 *
 * @author NGUYEN DUC VIET
 */
interface Eat {

    void eatFood();
}

interface Bark{

    void makeSound();
}

class Animal {

    int age;

    public Animal() {
    }

    public Animal(int age) {
        this.age = age;
    }
}

class Cat extends Animal implements Eat {

    String name;

    public Cat() {
    }

    public Cat(String name, int age) {
        super(age);
        this.name = name;
    }

    @Override
    public void eatFood() {
        System.out.println("Eat food");
    }
}

public class InstanceOf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cat c = new Cat("Cat", 2);
        System.out.println(c instanceof Cat);
        System.out.println(c instanceof Animal);
        System.out.println(c instanceof Eat);
        System.out.println(c instanceof Bark);
    }

}
