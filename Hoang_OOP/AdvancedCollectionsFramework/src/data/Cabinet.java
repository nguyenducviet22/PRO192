/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author NGUYEN DUC VIET
 */
public class Cabinet {

    private List<Student> arrList = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public Cabinet() {
    }

    public void updateStudent() {
        String keyword;
        double newGpa;
        System.out.println("Input updated student's id: ");
        keyword = sc.nextLine();
        Student xxx = searchStudent(keyword);
        if (xxx == null) {
            System.out.println("Not found.");
        } else {
            xxx.showInfo();
            System.out.print("Enter new gpa: ");
            newGpa = Double.parseDouble(sc.nextLine());
            xxx.setGpa(newGpa);
            
            System.out.println("After updating: ");
            xxx.showInfo();
        }
    }

    public Student searchStudent(String id) {
        if (arrList.isEmpty()) {
            return null;
        }
        for (int i = 0; i < arrList.size(); i++) {
            if (arrList.get(i).getId().equalsIgnoreCase(id)) {
                return arrList.get(i);
            }
        }
        return null;
    }

    public void searchStudent() {
        String keyword;
        System.out.println("Input searched id: ");
        keyword = sc.nextLine();
        Student xxx = searchStudent(keyword);
        if (xxx == null) {
            System.out.println("Not found.");
        } else {
            xxx.showInfo();
        }
    }

    public void addStudent() {
        String id, name;
        int yob;
        double gpa;

        System.out.println("Enter a student info: ");
        while (true) {
            System.out.print("Enter id: ");
            id = sc.nextLine().trim().toUpperCase();
            Student xxx = searchStudent(id);
            if (xxx == null) {
                break;
            } else {
                System.out.println("This id has existed. Try other id.");
            }
        }

        System.out.print("Enter name: ");
        name = sc.nextLine().trim().toUpperCase();

        System.out.print("Enter yob: ");
        yob = Integer.parseInt(sc.nextLine());

        System.out.print("Enter gpa: ");
        gpa = Double.parseDouble(sc.nextLine());

        arrList.add(new Student(id, name, yob, gpa));
    }

    public void printStudentList() {
        if (arrList.isEmpty()) {
            System.out.println("The student list is empty.");
            return;
        }

        System.out.println("There is/are " + arrList.size() + " student(s).");
        for (Student student : arrList) {
            student.showInfo();
        }
    }

}
