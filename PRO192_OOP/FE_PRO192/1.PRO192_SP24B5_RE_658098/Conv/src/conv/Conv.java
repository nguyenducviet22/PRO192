/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conv;

/**
 *
 * @author NGUYEN DUC VIET
 */
public class Conv {
    public void amethod(String s) {
        char c = 'H';
//        c += s;//Compile time error
        System.out.println(c);
    }
    
    public static void main(String[] args) {
        Conv c = new Conv();
        String s = new String("ello");
        c.amethod(s);
    }
}
