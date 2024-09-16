/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main_q50;

/**
 *
 * @author NGUYEN DUC VIET
 */
class Person {

    protected int age;

    protected int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }

}

class Professor extends Person {

    Professor(String val) {
        specialization = val;
    }

    String specialization;

    String getSpecialization() {
        return specialization;
    }
}

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Professor p1 = new Professor("Binh");
        Professor p2 = new Professor("Huong");
        p1.setAge(40);
        System.out.println(p2.getSpecialization() + ":" + p1.age);
        System.out.println(p1.getSpecialization() + ":" + p2.age);
    }
}
