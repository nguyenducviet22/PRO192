
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author NGUYEN DUC VIET
 */
public class StudentList extends ArrayList<Student> {

    public String getNameById(int id) {
        String name = "Not Found";
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getId() == id) {
                name = this.get(i).getName().toUpperCase();
            }
        }
        return name;
    }

    public int getNumOfMaxGPA() {
        double maxGpa = this.get(0).getGpa();
        for (int i = 0; i < this.size(); i++) {
            if (maxGpa < this.get(i).getGpa()) {
                maxGpa = this.get(i).getGpa();
            }
        }
        int count = 0;
        for (Student o : this) {
            if (o.getGpa() == maxGpa) {
                count++;
            }
        }
        return count;
    }
}
