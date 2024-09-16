/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainq6;

/**
 *
 * @author NGUYEN DUC VIET
 */
class Person {

    String name;
}

class Student extends Person {

    double marks;

    public Student(double marks, String name) {
        this.name = name;
//        super(name); Person Class does not have constructor to inherit
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + "-" + marks; //To change body of generated methods, choose Tools | Templates.
    }
}

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s = new Student(7.5, "Vu");
        System.out.println(s);
    }
}
