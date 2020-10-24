/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author tien1904
 */
public class methods {
    private int m,n;
    public methods(){
        int m;
        int n;
    }
    public  void nhap(){
        
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        
    }
    
//    public int ucln(){
//        if (m == 0 || n == 0){
//        return n + m;
//    }
//        else while (m != n){
//        if (m > n){
//            m -= n; // a = a - b
//        }else{
//            n -= m;
//        }
//    }
//    return m; 
//    }
    
    public int bcnn(){
            return m*n;
    }
    
    public  boolean snt(int n){
        if(n<2) return false;
        else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0) return false;
            }
            return true;
        }
    }
    
    public  int dem(){
        int dem =0 ;
        for(int i=m;i<=n;i++){
            
            if(snt(i)==true) dem++;
        }
                
            return dem;
    }
}
