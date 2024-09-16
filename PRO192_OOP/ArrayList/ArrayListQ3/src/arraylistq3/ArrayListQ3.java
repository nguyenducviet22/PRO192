/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistq3;

import java.util.Scanner;

/**
 *
 * @author NGUYEN DUC VIET
 */
public class ArrayListQ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentList list = new StudentList();
        list.insertStudent(new Student(0, "Lam Binh"));
        list.insertStudent(new Student(1, "Tien Duong"));
        list.insertStudent(new Student(2, "Nguy Van"));
        list.insertStudent(new Student(3, "Khac Tran"));
        list.insertStudent(new Student(4, "Minh Anh"));
        list.insertStudent(new Student(5, "Viet Cao"));

        int choice;

        do {
            System.out.println("\nStudent Management System");
            System.out.println("1. Find Student by Name");
            System.out.println("2. Find Student by ID");
            System.out.println("3. Insert Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Update Student");
            System.out.println("6. Sort Student List");
            System.out.println("7. Show Student List");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter name to find: ");
                    String name = sc.nextLine();
                    Student foundStu = list.findByName(name);
                    if (foundStu != null) {
                        System.out.println(foundStu);
                    } else {
                        System.out.println("Not found");
                    }
                    break;
                case 2:
                    System.out.print("Enter id to find: ");
                    int id = Integer.parseInt(sc.nextLine());
                    foundStu = list.findByID(id);
                    if (foundStu != null) {
                        System.out.println(foundStu);
                    } else {
                        System.out.println("Not found");
                    }
                    break;
                case 3:
                    System.out.println("Enter student info: ");
                    System.out.print("Enter id: ");
                    id = Integer.parseInt(sc.nextLine());
                    System.out.print("Enter name: ");
                    name = sc.nextLine();
                    Student newStudent = new Student(id, name);
                    list.insertStudent(newStudent);
                    break;
                case 4:
                    System.out.print("Enter id to delete: ");
                    id = Integer.parseInt(sc.nextLine());
                    list.deleteStudent(id);
                    break;
                case 5:
                    System.out.print("Enter id student wanna change: ");
                    id = Integer.parseInt(sc.nextLine());
//                    Student stu = list.findByID(id);
                    System.out.print("Enter new name: ");
                    name = sc.nextLine();
                    Student stu = new Student(id, name);
                    stu.setName(name);
                    list.updateStudent(id, stu);
                    break;
                case 6://do not sort the list as alphabet for charAt(234...)
                    System.out.println("Sort student by name: ");
                    list.sort(list);
                    System.out.println(list);
                    break;
                case 7:
                    list.showStudentList(list);
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);
    }
}
