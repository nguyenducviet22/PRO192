/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example_q35;

/**
 *
 * @author NGUYEN DUC VIET
 */
abstract class Person {

    String code, name;

    public Person(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public abstract double getAvg();

    @Override
    public String toString() {
        return code + "\t" + name + "\t" + getAvg();
    }
}

class Student extends Person {

    double mark1, mark2;

    public Student(String code, String name, double mark1, double mark2) {
        super(code, name);
        this.mark1 = mark1;
        this.mark2 = mark2;
    }

    @Override
    public double getAvg() {
        return (mark1 + mark2) / 2;
    }
}

public class Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s1 = new Student("SV01", "Lan", 5, 7);
        System.out.println(s1);
        System.out.println((double) 32%5);
    }
}
