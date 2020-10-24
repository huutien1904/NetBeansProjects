/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de1;

import java.util.Scanner;

/**
 *
 * @author tien1904
 */
public class methods2 {
    private int a,b,c;

    public methods2() {
//        int a;
//        int b;
//        int c;
    }
    
    public void set(){
        
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
    }
    public int ucln(int m,int n){
        if (m == 0 || n == 0){
        return n + m;
        }
        else while (m != n){
        if (m > n){
            m -= n; // a = a - b
        }else{
            n -= m;
        }
            
        }
        return m;
    }
        
   
    public boolean ktr(){
        if(ucln(a,b)!= 1) return false;
        if(ucln(b,c)!= 1) return false;
        if(ucln(a,c)!= 1) return false;
        return true;
        
        
    }
    
    public void phantich(){
        int i=2;
        System.out.println(a+" = ");
        while(a!=0){
            if(a%i==0){
                while(a%i!=0){
                    System.out.print(i + " + ");
                    a=a/i;
                }
            }
            else i++;
            
        }
    }
    
    
}
