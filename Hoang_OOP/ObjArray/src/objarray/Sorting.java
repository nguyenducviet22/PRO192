/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objarray;

import java.util.Scanner;

/**
 *
 * @author NGUYEN DUC VIET
 */
public class Sorting {

    public static void main(String[] args) {
//        sortPrimitiveArray();
//        sortStudentList();
        inputStudentList();
    }

    public static void inputStudentList() {
        String id, name;
        int yob;
        double gpa;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many students do you wanna input: ");
        int count = Integer.parseInt(sc.nextLine());
        Student arr[] = new Student[count];

        for (int i = 0; i < count; i++) {
            System.out.println("Input student number " + (i + 1));
            System.out.println("Input id: ");
            id = sc.nextLine();
            System.out.println("Input name: ");
            name = sc.nextLine();
            System.out.println("Input yob: ");
            yob = Integer.parseInt(sc.nextLine());
            System.out.println("Input gpa: ");
            gpa = Double.parseDouble(sc.nextLine());
            arr[i] = new Student(id, name, yob, gpa);
        }
        
        for (Student student : arr) {
            student.showProfile();
        }

    }

    public static void sortStudentList() {
        Student arr[] = new Student[4];
        arr[0] = new Student("SE190001", "Harry Potter", 2004, 9.9);
        arr[1] = new Student("SE190002", "Hermione Granger", 2003, 9.5);
        arr[2] = new Student("SE190003", "Ron Weasley", 2004, 8.9);
        arr[3] = new Student("SE190004", "Draco Malfoy", 2004, 9.0);

        for (Student student : arr) {
            student.showProfile();

        }
        System.out.println("\n");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getGpa() > arr[j].getGpa()) {
                    Student tem = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tem;
                }
            }
        }

        for (Student student : arr) {
            student.showProfile();

        }
    }

    public static void sortPrimitiveArray() {
        int a[] = new int[]{5, 8, 4, 3, 9, 1, 7, 6, 2};

        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int tem = a[i];
                    a[i] = a[j];
                    a[j] = tem;
                }
            }
        }
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
