/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pri;

//private class Base { //cannot declare public/private here
class Base {
    Base() {
        int i = 100;
        System.out.println(i);
    }
}

public class Pri extends Base {

    static int i = 200;

    public static void main(String[] args) {
        Pri p = new Pri();
        System.out.println(i);
    }

}
