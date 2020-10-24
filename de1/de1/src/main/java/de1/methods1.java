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
public class methods1 {
    private float a,b,c;

    public methods1() {
    }
    
    public void set(){
        
        Scanner sc = new Scanner(System.in);
        
        a =  sc.nextInt();
        b =  sc.nextInt();
        c =  sc.nextInt();
    }
    
    public float max(){
        float max=a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        return max;
    }
    
    public float dientich(){
        float p =(a+b+c)/2;
        return p*(p-a)*(p-b)*(p-c);
    }
    public void giaipt(){
        if(a==0){
            if(b==0){
                if(c==0) System.out.println("phuong trinh vo so nghiem");
                else System.out.println("phuong trinh vo nghiem");
            }
            else{
                if(c!=0) System.out.println("phuong trinh co nghiem: "+ -c/b);
            }
        }
        else {
            float denta = b*b -4*a*c;
            if(denta > 0){
                System.out.println("phuong trinh co 2 nghiem :");
                System.out.println("x1 = " + -b+Math.sqrt(denta)/2*a);
                System.out.println("x2 = " + ((-b)-(Math.sqrt(denta))/2*a));
            }
            if(denta==0) System.out.println("phuong trinh co 1 nghiem : "+ -b/2*a);
            else System.out.println("phuong trinh vo nghiem");
        }
    }
}
