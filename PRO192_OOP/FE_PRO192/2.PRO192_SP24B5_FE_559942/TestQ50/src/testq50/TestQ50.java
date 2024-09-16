/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testq50;

/**
 *
 * @author NGUYEN DUC VIET
 */
class Test{
    public String foo(int x, int y){
        return "AA";
    }
    
    public String foo(String[] arr){
        return "BB";
    }
}
public class TestQ50 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Test a = new Test();
//        String[] str = {"4", "5"};
//        System.out.println(a.foo(str));
        System.out.println(a.foo(4, 5));
        
    }
    
}
