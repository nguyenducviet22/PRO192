/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import data.StudentFile;
import java.util.Scanner;

/**
 *
 * @author NGUYEN DUC VIET
 */
public class StudentManagement2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        StudentFile se19 = new StudentFile(01, "SE19");
        do {
            printMenu();
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1: se19.addStudent();
                    break;
                case 2: se19.printStudents();
                    break;
                case 3: se19.searchStudent();
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Bye bye");
                    break;
                default:
                    System.out.println("Please choose 1 to 6");
            }
        } while (choice != 6);

    }

    public static void printMenu() {
        System.out.println("Welcome to FAP: ");
        System.out.println("Please choose a function:");
        System.out.println("1. Add a new student");
        System.out.println("2. Print a student's profile");
        System.out.println("3. Update a student's profile");
        System.out.println("4. Remove a student");
        System.out.println("5. Quit");
    }

    public static void test() {
        StudentFile se19 = new StudentFile(01, "SE19");
        se19.addStudent();
        se19.addStudent();

        StudentFile is19 = new StudentFile(01, "IS19");
        is19.addStudent();

        System.out.println("SE19 students list:");
        se19.printStudents();

        System.out.println("IS19 students list");
        is19.printStudents();

    }

}
