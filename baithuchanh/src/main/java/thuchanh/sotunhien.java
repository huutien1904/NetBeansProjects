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
public class sotunhien {

    private int n;

    public sotunhien() {
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);

        n = Integer.parseInt(sc.nextLine());
    }

    public int tinhtong() {
        int tg = 0;
        for (int i = 0; i <= n; i++) {
            tg = tg + i;

        }
        return tg;
    }

    public int giaithua() {
        int tg = 1;
        for (int i = 0; i <= n; i++) {
            tg = tg * i;

        }
        return tg;
    }

    public int sotn() {
        int m = n;
        int t = 0;

        while (n > 0) {
            m = m * 10 + n % 10;
            n = n / 10;
        }
        if (m == t) {
            return 1;
        } else {
            return 0;
        }

    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
