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
public class main {

    public static void main(String[] args) {

        sotunhien d = new sotunhien();
        matran m = null;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("0.exit");
            System.out.println("1.nhap n:");
            System.out.println("2.tinh tong");
            System.out.println("3.tinh giai thua");
            System.out.println("4.so thuan nghic");
            System.out.println("5.nhap ma tran");
            System.out.println("6.duong cheo chinh");
            System.out.println("7.dua ra phan tu nguyen to");
            System.out.println("8. tinh dinh thuc");

            int choose;

            choose = Integer.parseInt(sc.nextLine());

            switch (choose) {
                case 0:
                    System.out.println("byee");
                    System.exit(choose);
                    break;
                case 5:
                    Scanner in = new Scanner(System.in);
                    System.out.println("nhap n: ");
                    int n = Integer.parseInt(in.nextLine());
                    m = new matran(n);
                    m.nhap();
                    break;
                case 6:
                    m.in();
                    break;
                case 7:
                    m.insnt();
                    break;
            }
        }
    }
}
