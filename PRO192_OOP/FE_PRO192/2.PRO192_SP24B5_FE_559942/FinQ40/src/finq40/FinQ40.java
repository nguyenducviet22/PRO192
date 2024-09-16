/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finq40;

/**
 *
 * @author NGUYEN DUC VIET
 */
class Base {

    public final void amethod() {
        System.out.println("amethod");
    }
}

public class FinQ40 extends Base {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Base b = new Base();
        b.amethod();
    }

}
