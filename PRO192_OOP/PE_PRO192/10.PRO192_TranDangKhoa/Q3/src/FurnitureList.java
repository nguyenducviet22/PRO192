
import java.util.ArrayList;
import java.util.Comparator;

 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NGUYEN DUC VIET
 */
public class FurnitureList  extends ArrayList<Furniture> {
    public void addFurniture(Furniture furniture){
        this.add(furniture);
    }
    
    public String getNameById(int id){
        String name = "";
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getId() == id){
                name = this.get(i).getName().toUpperCase();
            } else {
                name = "N/A";
            }
        }
        return name;
    }
    
    public FurnitureList getFurnitureList() {
        this.sort(new Comparator<Furniture>() {
            @Override
            public int compare(Furniture o1, Furniture o2) {
                if (o1.getQuantity() > o2.getQuantity()){
                    return 1;
                } else if (o1.getQuantity() > o2.getQuantity()){
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        return this;
    }
    
    public int getTotalQuantity(){
        int sum = 0;
        for (Furniture o : this) {
            sum += o.getQuantity();
        }
        return sum;
    }
}
