/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NGUYEN DUC VIET
 */
public class Helpers implements Actionable{

    @Override
    public int countWords(String string) {
        String[] words = string.split("\\s+");
        int count = 0;
        for (String w : words) {
            count++;
        }
        return count;
    }

    @Override
    public String getFirstWord(String string) {
        String[] words = string.split("\\s+");
        String fword = words[0];
        String fchar = fword.substring(0, 1).toUpperCase();
        String rchar = fword.substring(1);
        String rs = fchar + rchar;
        return rs;
    }
    
}
