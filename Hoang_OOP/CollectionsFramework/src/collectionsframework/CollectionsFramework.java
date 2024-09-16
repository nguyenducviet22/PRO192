package collectionsframework;

import data.Student;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsFramework {

    public static void main(String[] args) {
//        crudSet();
        List<Student> arrList = crudStudent();
        
//        swapInArrList(arrList);
//        sortStudentList(arrList);

        Student rs = serachStudent(arrList, "Se1903");
        if (rs != null) {
            System.out.println("The all results: ");
            rs.showInfo();
        } else {
            System.out.println("Not found");
        }
    }

    public static Student serachStudent(List<Student> arrList, String id) {
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

    public static void sortStudentList(List<Student> arrList) {
//        List<Student> arrList = new ArrayList();
//        Student stu1 = new Student("SE1901", "Harry", 2004, 9.5);
//        Student stu2 = new Student("SE1902", "Hermonine", 2003, 9.7);
//        Student stu3 = new Student("SE1903", "Ron", 2004, 8.5);
//        Student stu4 = new Student("SE1904", "Draco", 2004, 8.7);
//
//        arrList.add(stu1);
//        arrList.add(stu2);
//        arrList.add(stu3);
//        arrList.add(stu4);

        System.out.println("After sorting: ");
        for (int i = 0; i < arrList.size() - 1; i++) {
            for (int j = i + 1; j < arrList.size(); j++) {
                if (arrList.get(i).getGpa() > arrList.get(j).getGpa()) {
                    Student tem = arrList.get(i);
                    arrList.set(i, arrList.get(j));
                    arrList.set(j, tem);
                }
            }
        }

        for (Student student : arrList) {
            student.showInfo();
        }
    }

    public static void swapInArrList(List<Student> arrList) {
        Student tem = arrList.get(0);
        arrList.set(0, arrList.get(1));
        arrList.set(1, tem);

        System.out.println("After swapping");
        for (Student student : arrList) {
            student.showInfo();
        }
    }

    public static List<Student> crudStudent() {
        List<Student> arrList = new ArrayList();
        Student stu1 = new Student("SE1901", "Harry", 2004, 9.5);
        Student stu2 = new Student("SE1902", "Hermonine", 2003, 9.7);
        Student stu3 = new Student("SE1903", "Ron", 2004, 8.5);

        arrList.add(stu2);
        arrList.add(stu1);
        arrList.add(stu2);
        arrList.add(stu3);
        arrList.add(new Student("SE1904", "Draco", 2004, 9.3));

        System.out.println("The list has " + arrList.size() + " objs");

        System.out.println("Print each student: ");
        Student stu = arrList.get(0);
        stu.showInfo();
        arrList.get(1).showInfo();

        System.out.println("Print all students: ");
        for (Student student : arrList) {
            student.showInfo();
        }
        System.out.println("After Removing: ");
        arrList.remove(stu2);
        for (int i = 0; i < arrList.size(); i++) {
            arrList.get(i).showInfo();
        }
        return arrList;
    }

    public static void crudSet() {
        Set<Student> hashSet = new HashSet();
        Student stu1 = new Student("SE1901", "Harry", 2004, 9.5);
        Student stu2 = new Student("SE1902", "Hermonine", 2003, 9.7);
        Student stu3 = new Student("SE1903", "Ron", 2004, 9.3);

        hashSet.add(stu1);
        hashSet.add(stu2);
        hashSet.add(stu2);
        hashSet.add(stu3);

        for (Student student : hashSet) {
            student.showInfo();
        }
    }

}
