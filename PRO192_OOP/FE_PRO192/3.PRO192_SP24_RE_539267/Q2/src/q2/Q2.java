/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2;

/**
 *
 * @author NGUYEN DUC VIET
 */
class C {
//    void m1(){} // cannot default
//    public void m1(){} //cannot public
//    protected void m1(){} //cannot protected
    private void m1() {}
}

class D extends C {
     private void m1() {}
}

public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

}
