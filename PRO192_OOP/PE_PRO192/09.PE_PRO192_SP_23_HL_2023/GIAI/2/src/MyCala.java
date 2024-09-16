
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class MyCala implements ICala{

    @Override
    public int f1(List<Cala> t) {
        int count = 0;
        for(Cala x : t){
            if(x.getPrice() % 2 == 0){
                count++;
            }
        }
        return count;
    }

    @Override
    public void f2(List<Cala> t) {
        int min_price = Integer.MAX_VALUE;// tìm value min
        
        int count = 0;// đếm phân tử
        
        int index = 0;// lưu lại vị trí để xóa
        //tìm min_prince
        for(Cala x : t){
            if(x.getPrice() < min_price){
                min_price = x.getPrice();
            }
        }
        
        for(int i = 0; i < t.size(); i++){
            if(min_price == t.get(i).getPrice()){
                count++;//đếm thứ 2 nếu kh có thứ 2 thì lấy thứ nhất
                index = i;
            }
            if(count == 2){
                break;// nếu có 2 cái thì thoát ra
            }
        }
        t.remove(index);// nếu count = 2 thì index = vị tró thứ 2 còn nếu count = 1 thì = vị trí thứ nhất
    }

    @Override
    public void f3(List<Cala> t) {
        for(int i = 0; i < t.size() - 1; i ++){
            for(int j = i + 1; j < t.size(); j++){
                if(t.get(i).getOwner().charAt(0) < t.get(j).getOwner().charAt(0)){
                    String tmp = t.get(i).getOwner();
                    t.get(i).setOwner(t.get(j).getOwner());
                    t.get(j).setOwner(tmp);
                }
            }
        }
    }
    
}
