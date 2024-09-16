/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electriccooker;

/**
 *
 * @author NGUYEN DUC VIET
 */
//Q9
public class ElectricCooker implements Appliance { //1

    public void cook() {}
}

abstract class ElectricRiceCooker1 extends ElectricCooker { //3
}

abstract class ElectricRiceCooker2 extends ElectricCooker { // 5

    public void cook(double time) {}
}

class ElectricRiceCooker3 extends ElectricCooker implements Appliance {// 7

    public void ricecook() {}
}

interface Appliance {//9

    public void cook();
}
