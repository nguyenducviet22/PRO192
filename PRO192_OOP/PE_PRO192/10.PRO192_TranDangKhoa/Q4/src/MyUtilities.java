 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NGUYEN DUC VIET
 */
public class MyUtilities implements IUtilities {

    @Override
    public int sumNumber(int number) {
        int sum = 0;
        int t = number/2;
        for (int i = 1; i < t; i++) {
            if (number % i == 0){
                sum += i;
            }
        }
        return sum;
    }

    @Override //PRO192 lap trinh pro192
    public String replaceString(String sentence, String s1, String s2) {
        String[] words = sentence.split("\\s+");
        String rs = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].equalsIgnoreCase(s1)){
                words[i] = s2;
                rs += words[i] + " ";
            } else {
                rs += words[i] + " ";
            }
        }
        return rs.trim();
    }
    
}
