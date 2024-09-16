
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author admin
 */
public class MyString implements IString {

    public static boolean check_rev(String s) {
        StringBuilder sb = new StringBuilder(s);
        return s.equals(sb.reverse().toString());
    }

    @Override
    public int f1(String str) {
        int count = 0;
        StringTokenizer st = new StringTokenizer(str);
        while (st.hasMoreElements()) {
            String tmp = st.nextToken();
            for (int i = 0; i < tmp.length(); i++) {
                if (Character.isDigit(tmp.charAt(i))) {
                    String k = "";
                    k += tmp.charAt(i);
                    if (Integer.parseInt(k) % 2 == 0) {
                        count++;
                        break;
                    }
                }
            }
        }
        return count;
    }

    @Override
    public String f2(String str) {
        
        StringTokenizer st = new StringTokenizer(str);
        ArrayList<String> arr = new ArrayList<>();
        while(st.hasMoreElements()){
            arr.add(st.nextToken());
        }
        int count = 0;
        for(int i = 0; i < arr.size(); i++){
            if(check_rev(arr.get(i))){
                count++;
                arr.set(i, "YY");
            }
            if(count == 1){
                break;
            }
        }
        str = "";
        for(String x : arr){
            str += x;
            str += " ";
        }
        
        return str;
    }

}
