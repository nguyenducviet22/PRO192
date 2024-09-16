/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testq10;

/**
 *
 * @author NGUYEN DUC VIET
 */
class People {
    int id;

    public People(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id + ""; //To change body of generated methods, choose Tools | Templates.
    }
    
}
public class TestQ10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TestQ10 t1 = new TestQ10();
        People p1 = new People(101);
        System.out.println(t1 + " " + p1);
    }
    
}
