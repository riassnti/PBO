package com.pbo;

import java.util.Scanner;

public class PengelompokanOperasiAritmatika {

    public static void main(String[] args) {
        /* kesimpulannya adalah
            perkalian atau pembagian akan dilakukan terlebih dahulu
        */
        /* jika dilakukan perkalian dan pembagian, maka
            akan dilakukan operasinya dari kiri ke kanan
        */

        System.out.println("PENGELOMPOKAN OPERASI ARITMATIKA");
        int hasil = 5 * 10 / 2;
        System.out.println(hasil);
        hasil = 5 + 2 - 10;
        System.out.println(hasil);

        //menggunakan pengelompokan operasi dengan tanda kurung ()
        hasil = 60 / (2 + 10);
        System.out.println(hasil);

        Scanner userInput = new Scanner(System.in);
        //perhitungan persamaan kuadrat
        System.out.println("MENGHITUNG PERSAMAAN KUADRAT");
        int m,x,c;

        System.out.println("Nilai x = ");
        x = userInput.nextInt();
        System.out.println("Gradien m = ");
        m = userInput.nextInt();
        System.out.println("Bias c = ");
        c = userInput.nextInt();

        int y = (m * x * x) + c;
        System.out.println("Nilai y = " + y);
    }
}
