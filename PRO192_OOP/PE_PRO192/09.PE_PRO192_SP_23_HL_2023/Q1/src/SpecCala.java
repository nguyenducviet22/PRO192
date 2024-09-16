/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NGUYEN DUC VIET
 */
public class SpecCala extends Cala{
    private int color;

    public SpecCala() {
    }

    public SpecCala(String owner, int price, int color) {
        super(owner, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" # %d", color); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setData(){//joHN wICK 109 PARIs
        String[] words = getOwner().split("\\s+");
        String str = "";
        for (String word : words) {
            str += word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase() + " ";
        }
        setOwner(str.trim());
        System.out.println(getOwner());
    }
    
    public int getValue(){
        int price = getPrice();
        if (color %2 == 0){
            price += 1;
        } else {
            price *= 2;
        }
        return price;
    }
}
