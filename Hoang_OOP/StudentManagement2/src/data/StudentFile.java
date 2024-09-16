/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Scanner;

/**
 *
 * @author NGUYEN DUC VIET
 */
public class StudentFile {

    private int fileNumber;
    private String fileName;
    private int count = 0;

    private Student[] stu = new Student[5];
    private Scanner sc = new Scanner(System.in);

    public StudentFile(int fileNumber, String fileName) {
        this.fileNumber = fileNumber;
        this.fileName = fileName;
    }

    public int getFileNumber() {
        return fileNumber;
    }

    public void setFileNumber(int fileNumber) {
        this.fileNumber = fileNumber;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void addStudent() {
        String id, name;
        int yob;
        double gpa;

        System.out.println("Input student number " + (count + 1));
        System.out.print("Input id: ");
        id = sc.nextLine();
        System.out.print("Input name: ");
        name = sc.nextLine();
        System.out.print("Input yob: ");
        yob = Integer.parseInt(sc.nextLine());
        System.out.print("Input gpa: ");
        gpa = Double.parseDouble(sc.nextLine());
        stu[count] = new Student(id, name, yob, gpa);
        count++;
    }

    public void printStudents() {
//        System.out.println("Students List: ");
//        for (Student student : stu) {
//            student.showProfile();
//        }
        for (int i = 0; i < count; i++) {
            stu[i].showProfile();

        }

    }
    
    public void searchStudent(){
        String id;
        System.out.print("Enter the id: ");
        id = sc.nextLine();
        for (int i = 0; i < count; i++) {
            if (stu[i].getId().equalsIgnoreCase(id) == true){
                stu[i].showProfile();
                return;
            }
        }
        System.out.println("Not found");
    }
}
