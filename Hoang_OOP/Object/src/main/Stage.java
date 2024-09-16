package main;

import data.Students;

public class Stage {
    
    public static void main(String[] args) {
//        checkObj3();
        checkObj4().showProfile();
    }
    
    //return an obj
    public static Students checkObj4() {
        Students student = new Students("Harry Potter", 2004, 10.0);
        return student;
    }
    
    //2 pointer var point the same obj/ tuy 2 but 1
    public static void checkObj3() {
        Students student = new Students("Harry Potter", 2004, 10.0);
        Students x = student;
        
        student.setName("Hermione");//x's name is also changed into Hermione
        x.showProfile();//name = Hermione
    }
    
    //2 poiter var point 2 differrent objs (store in different ram)/ tuy 1 but 2
    public static void checkObj2() {
        Students student1 = new Students("Harry Potter", 2004, 10.0);
        Students student2 = new Students("Harry Potter", 2004, 10.0);
        
        student1.setName("Hermione Granger");//re-set name
        student1.showProfile();//name = Hermione
        student2.showProfile();//name = Harry
    }
    
    //set new student1 and restore the old student1
    public static void checkObj1() {
        Students student1 = new Students("Harry Potter", 2004, 10.0);
        Students x = student1;//store Harry in x var
        student1 = new Students("Hermione Granger", 2003, 9.5);
        
        student1.showProfile();//show Hermione info
        x.showProfile();//show Harry info
    }
}
