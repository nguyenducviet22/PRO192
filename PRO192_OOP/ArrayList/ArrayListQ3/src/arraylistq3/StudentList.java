/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistq3;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author NGUYEN DUC VIET
 */
public class StudentList extends ArrayList<Student> {

    public Student findByID(int id) {
        for (Student stu : this) {
            if (stu.getId() == id) {
                return stu;
            }
        }
        return null;
    }

    public Student findByName(String name) {
        for (Student stu : this) {
            if (stu.getName().equals(name)) {
                return stu;
            }
        }
        return null;
    }

    public void insertStudent(Student student) {
        this.add(student);
        System.out.println("Insert successfully.");
    }

    public void deleteStudent(int id) {
        this.remove(id);
        System.out.println("Delete successfully.");
    }

    public void updateStudent(int id, Student student) {
        this.set(id, student);
        System.out.println("Update successfully.");
    }

    public void sort(ArrayList<Student> al) {
        al.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (o1.getName().split(" ")[1].compareTo(o2.getName().split(" ")[1]));
            }
        });
    }

    public void showStudentList(StudentList stuList) {
        System.out.println("Students List: ");
        for (Student e : this) {
            System.out.println(e);
        }
    }
}
