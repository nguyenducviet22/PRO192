/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainq26;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author NGUYEN DUC VIET
 */
//class A implements Serializable{
class A {

    String name;
    int age;

    A(String na, int ag) {
        name = na;
        age = ag;
    }
}

public class MainQ26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            File f = new File("xxx.ser");
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(new A("HOA", 22));
            oos.close();
            fos.close();
            System.out.println("success");
        } catch (Exception e) {
            System.out.println("error"); // A Class needs to implement Serializable
        }
    }
}
