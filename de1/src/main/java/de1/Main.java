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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        methods1 n = new methods1();
        Scanner input = new Scanner(System.in);
        methods2 d = new methods2();
        
        while ( true ) {
            System.out.println("1 : Nhap vao 3 so thuc a ,b, c: ");
            System.out.println("2 : viet ra so lon nhat");
            System.out.println("3 : tinh dien tich tam giac: ");
            System.out.println("4 : giai phuong trinh bac hai");
            System.out.println("5 : nhap vao 3 so nguyen a,b,c");
            System.out.println("6 : kiem tra so nguyen to cung nhau hay khong:");
            System.out.println("7 : liet ke hona vi");
            System.out.println("8 : phan tich thua so nguyen to");
            
            System.out.println("0 : Exit");
            int choose = input.nextInt();
            switch ( choose ) {
                case 1 :
                    n.set();
                    break;
                case 2 :
                    System.out.println(n.max());
                    break;
                case 3 : 
                    System.out.println(n.dientich());
                    break;
                case 4 :
                    n.giaipt();
                   
                    break;
                case 5 :
                    d.set();
                    break;
                case 6 :
                    if(d.ktr()==true) System.out.println("co la so nguyen to cung nhau");
                    else System.out.println("khong la so nguyen to cung nhau");
                    break;
                case 7 : 
                    System.out.println("cho nay chua lam a");
                    break;
                case 8 :
                    d.phantich();
                    break;
                
                case 0 : 
                    System.out.println("Bye bye");
                    System.exit(0);
                    break;
                default :
                    System.err.println("Ch? ???c ch?n t? 0 ??n 9");
            }
        }
        // TODO code application logic here
    }
    
}
