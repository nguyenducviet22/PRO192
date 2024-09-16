/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readandwrite;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NGUYEN DUC VIET
 */
public class ReadAndWrite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Student> list = readFromFile();
        for (Student student : list) {
            System.out.println(student);
        }
    }

    public static List<Student> readFromFile() {
        List<Student> list = new ArrayList<>();
        try {
            FileReader fr = new FileReader("Student data.txt");
            BufferedReader br = new BufferedReader(fr);
            String info = "";
            while (true) {
                info = br.readLine();
                if (info == null) {
                    break;
                }
                String str[] = info.split(",");
                int id = Integer.parseInt(str[0]);
                String name = str[1];
                double gpa = Double.parseDouble(str[2]);
                list.add(new Student(id, name, gpa));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public static void writeToFile(String arr[]) {
        try {
            FileWriter fw = new FileWriter("data.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            for (String string : arr) {
                bw.write(string);
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
        }
    }

    public static void writeToFile(List<Student> list) {
        try {
            FileWriter fw = new FileWriter("Student data.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Student student : list) {
                bw.write(student.toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
        }
    }

}
