/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NGUYEN DUC VIET
 */
public class StringProcessor implements IStringOperations{

    @Override
    public int countVowels(String value) {
        int count = 0;
        for (char c : value.toLowerCase().toCharArray()) {
            if (c == 'u'||c == 'e'||c == 'o'
              ||c == 'a'||c == 'i'){
                count++;
            }
        }
        return count;
    }

    @Override
    public String reverseString(String value) {
//        char arr[] = value.toCharArray();
//        String rs = "";
//        for (int i = arr.length - 1; i >= 0; i--) {
//            rs = "" + arr[i];
//        }
//        return rs;
        return new StringBuilder(value).reverse().toString();
    }
    
}
