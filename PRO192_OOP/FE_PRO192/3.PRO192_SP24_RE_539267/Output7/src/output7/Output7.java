/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package output7;

/**
 *
 * @author NGUYEN DUC VIET
 */
public class Output7 {
    
    public static int sum(int... nums) {
        int sum = 0;
        for (int x : nums) {
            sum += x;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        sum(10);//do not print out
        sum(10, 20);//do not print out
        System.out.println(sum(10));
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20));
    }
}
