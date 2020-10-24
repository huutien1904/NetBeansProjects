/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thuchanh;

import java.util.Scanner;

/**
 *
 * @author tien1904
 */
public class matran {

    public int[][] a;

    public matran(int n) {
        a = new int[n][n];

    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length; j++) {
                System.out.println(i + "," + j);
                a[i][j] = Integer.parseInt(sc.nextLine());

            }

        }
    }

    public void in() {
        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length; j++) {
                if (i == j) {
                    
                    System.out.println(a[i][j]);
                }

            }

        }
    }
    public int snt(int n){
        if(n<2) return 0;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return 0;
        }
        return 1;
        
    }
    
    public void insnt(){
        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length; j++) {
                if(snt(a[i][j])==1) System.out.println(a[i][j]);
            }

        }
    }

}
