/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainq26;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author NGUYEN DUC VIET
 */
public class Main {
    public static void main(String[] args) {
        String file = "src/result.dat";
        String[] num = {"An", "an", "An an"};
        List<String> list = new ArrayList<>(Arrays.asList(num));
        Collections.sort(list);
        try {
            PrintWriter out = new PrintWriter(file);
            out.write(list.toString());
            out.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
