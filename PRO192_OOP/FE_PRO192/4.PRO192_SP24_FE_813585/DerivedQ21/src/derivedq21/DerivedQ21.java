/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package derivedq21;

/**
 *
 * @author NGUYEN DUC VIET
 */
class Base extends Object {//cannot declare public Class

    String objType;

    public Base() {
        objType = "I am a Base Type";
    }
}

public class DerivedQ21 extends Base {

    public DerivedQ21() {
        objType = "I am a De Type";
    }

    public static void main(String[] args) {
        DerivedQ21 d = new DerivedQ21();
    }

}
