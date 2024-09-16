/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainq49;

/**
 *
 * @author NGUYEN DUC VIET
 */
public class MainQ49 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Object[] myObj = {new Integer(12), new String("foo"), 
            new Integer(5), new Boolean(true)};
        java.util.Array.sort(myObj);//Arrays 
        for (int i = 0; i < myObj.length; i++) {
            System.out.println(myObj[i].toString());
            System.out.println(" ");
        }
    }

}
