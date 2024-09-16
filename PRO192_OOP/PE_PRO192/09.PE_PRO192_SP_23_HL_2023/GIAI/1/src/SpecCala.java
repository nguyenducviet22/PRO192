/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class SpecCala extends Cala {

    private int color;

    public SpecCala() {
    }

    public SpecCala(String owner, int price, int color) {
        super(owner, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + " # " + color;
    }

    public void setData() {
        StringBuilder sb = new StringBuilder();
        String s = super.getOwner();
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' '){
                sb.append(Character.toUpperCase(s.charAt(i)));
                while(i < s.length() - 1 && s.charAt(i) != ' '){
                    i++;
                    sb.append(Character.toLowerCase(s.charAt(i)));
                }
            }else{
                sb.append(s.charAt(i));
            }
        }
        super.setOwner(sb.toString());
       
    }

    public int getValue() {
        if (color % 2 == 0) {
            return super.getPrice() + 1;
        } else {
            return super.getPrice() * 2;
        }

    }
}
