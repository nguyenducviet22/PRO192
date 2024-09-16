package fumanagement;

import data.Student;
import java.util.Scanner;

public class FUManagement {
    public static void main(String[] args) {
//        inputAStudent();
        saveAStudent();
        
    }
    
    public static void inputAStudent(){
        String id, name;
        int yob;
        double gpa;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your id: ");
        id = sc.nextLine();
        System.out.println("Enter your name: ");
        name = sc.nextLine();
        System.out.println("Enter your yob: ");
        yob = sc.nextInt();
        System.out.println("Enter your gpa: ");
        gpa = sc.nextDouble();
        
        Student stu = new Student(id, name, yob, gpa);
        stu.showProfile();
        
    }
    
    public static void saveAStudent(){
        Student harryPotter = new Student("SE190001", "Harry Potter", 2004, 9.8);
        Student hermioneGranger = new Student("SE190002", "Hermione Granger", 2003, 9.5);
        
        harryPotter.showProfile();
        hermioneGranger.showProfile();
                
        System.out.print("Harry says: ");
        harryPotter.sayHi();//sayHi() is a static method/function
        System.out.print("Student Class say: ");
        Student.sayHi();//so we should use Class name not var name
        
    }
    
}
