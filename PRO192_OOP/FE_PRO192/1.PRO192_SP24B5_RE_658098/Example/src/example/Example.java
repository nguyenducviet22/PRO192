/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

/**
 *
 * @author NGUYEN DUC VIET
 */
public class Example {

    public static void main(String[] args) {
//        Q24
        Person p1 = new Person("Hung", 20);
        Person p2 = new Person("Ha", 22);
        Person p3 = (new Example()).change(p2, "Nam");
        System.out.println(p3.getCode() + " " + p3.name + " " + p3.age);

//        Q25
        String str = "FPT";
        str.concat(" University!");
        str.toLowerCase();
        System.out.println(str + " " + str.length());
    }

    public Person change(Person p, String name) {
        Person p1 = p;
        p1.name = name;
        return p1;
    }
}

class Person {

    private int code;
    String name;
    int age;

    public Person(String name, int age) {
        this.code++;
        this.name = name;
        this.age = age;
    }

    public int getCode() {
        return code;
    }
}
