package com.pbo;

public class DoWhileLoop {

    public static void main(String[] args) {


       /* do {
              aksi
          } while (kondisi);
        */

        System.out.println("DO WHILE LOOP");
        System.out.println("Ini adalah awal program");

        int a = 0;
        boolean kondisi = true;

        do {
            a++;
            System.out.println("do while ke-" + a);
            if (a == 1) {
                kondisi = false;
            }
        } while(kondisi);

        System.out.println("Ini adalah akhir program");
    }
}