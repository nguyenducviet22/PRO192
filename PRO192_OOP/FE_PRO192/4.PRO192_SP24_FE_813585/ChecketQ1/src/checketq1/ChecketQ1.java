/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checketq1;

/**
 *
 * @author NGUYEN DUC VIET
 */
class Base {

    Base() {
        System.out.println("Base");
    }
}

public class ChecketQ1 extends Base {

    ChecketQ1() {
        super();
        System.out.println("Checket");
    }

    public static void main(String[] args) {
        ChecketQ1 c = new ChecketQ1();
    }
}
