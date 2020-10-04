package com.pbo;

import java.util.*;

public class LatihanLoopingFibonacci {

    public static void main(String[] args) {

        System.out.println("MENGHITUNG NILAI DERET FIBONACCI KE-n ");

        int f_n, f_n_1, f_n_2, n;

        Scanner inputUser = new Scanner(System.in);
        System.out.print("Mengambil nilai fibonacci ke-:");
        n = inputUser.nextInt();

        f_n_2 = 0;
        f_n_1 = 1;
        f_n = 1;

        for(int i = 1; i <= n; i++){
            System.out.println("Nilai ke-"+ i + " adalah " + f_n);
            f_n = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;
        }
    }
}
