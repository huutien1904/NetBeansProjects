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
public class Main {
    
    
    public static void main(String[] args) {
        methods d = new methods();
            Scanner  sc =new Scanner(System.in);
        while(true){
                    
            System.out.println("0. thoat khoi chung trinh");
            System.out.println("1.nhap vao 2 so  m,n:");
            System.out.println("2.tim ra ucln,bcnn");
            System.out.println("3.dem so nguyen to");
            System.out.println("nhap voa lua chon cua ban(0-3) : ");
            int choice;
            
            
            choice =  sc.nextInt();
            
            switch(choice){
                case 0: System.exit(choice);
                break;
                
                case 1:
                    d.nhap();
                break;
                
                case 2:{
//                    System.out.println("uoc chung lon nhat cua m,n: "+ d.ucln());
                    System.out.println( d.bcnn());
                }
                break;
                
                case 3:
                    
                    
                    System.out.println(d.dem());
                    break;
                default:System.out.println("moi ban nhap tu 0 - 3 thoi  ");
            }
                    
            
        }
    }

}
