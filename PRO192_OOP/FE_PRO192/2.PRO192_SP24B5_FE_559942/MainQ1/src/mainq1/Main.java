/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainq1;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author NGUYEN DUC VIET
 */
class Student {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name = " + name + ", Age = " + age;
    }
}

class SortByAge implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge() - o2.getAge();
    }
}

public class Main {
    public static void main(String[] args) {
        Student[] ls = new Student[3];
        ls[0] = new Student("A", 25);
        ls[1] = new Student("B", 20);
        ls[2] = new Student("C", 22);
        
        Arrays.sort(ls, 0, 2, new SortByAge());
        
        for (Student l : ls) {
            System.out.println(l);
        }
    }
}
