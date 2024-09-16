/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainq25;

/**
 *
 * @author NGUYEN DUC VIET
 */
class Person {
    public static void display(){
        System.out.println("Person");
    }
}

class Student extends Person{
    public static void display(){
        System.out.println("Student");
    }
}

public class MainQ25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
        ((Person) s).display();
    }
    
}
