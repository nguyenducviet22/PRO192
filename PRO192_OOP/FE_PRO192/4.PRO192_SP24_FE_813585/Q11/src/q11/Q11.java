/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q11;

/**
 *
 * @author NGUYEN DUC VIET
 */
public class Q11 {

    public static void main(String[] args) {
        Object obj = new int[]{1, 2, 3};
        int[] sArr = (int[]) obj;
        for (int i : sArr) {
            System.out.println(i + " ");
        }
    }
    
}
