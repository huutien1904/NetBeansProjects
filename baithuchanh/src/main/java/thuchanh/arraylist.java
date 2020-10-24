/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuchanh;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author tien1904
 */
public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> songuyen = new ArrayList<String>();
        
        songuyen.add("b");
        songuyen.add("a");
        songuyen.add("c");
        songuyen.add("g");
        songuyen.add("e");
        songuyen.add("f");
        System.out.println(songuyen);
        
        Collections.sort(songuyen);
        for (String string : songuyen) {
            System.out.println(string);
        }
    }
}
