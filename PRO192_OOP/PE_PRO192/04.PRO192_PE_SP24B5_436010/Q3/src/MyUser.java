
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author NGUYEN DUC VIET
 */
public class MyUser implements IUser {

    @Override
    public int f1(List<User> t) {
        int maxStatus = 0;
        for (int i = 0; i < t.size(); i++) {
            if (Character.isDigit(t.get(i).getName().charAt(1))) {
                maxStatus = t.get(i).getStatus();
            }
        }
        return maxStatus;
    }

    @Override
    public void f2(List<User> t) {
        User tem = t.get(3);
        t.set(3, t.get(5));
        t.set(5, tem);
    }

    @Override
    public void f3(List<User> t) {
        int maxStatus = 0;
        for (int i = 0; i < t.size(); i++) {
            if (maxStatus < t.get(i).getStatus()) {
                maxStatus = t.get(i).getStatus();
            }
            t.set(0, t.get(i));
        }
    }
}
