package com.pbo;

public class WhileLoop {

        public static void main(String[] args) {

            /*while (kondisi) {
                  aksi}
             */
            System.out.println("WHILE LOOP");

            int a = 0;
            boolean kondisi = true;

            System.out.println("Awal program");

            while (kondisi) {
                System.out.println("While loop ke-" + a);

                if (a == 10){
                    kondisi = false;
                }
                a++;
            }
            System.out.println("Akhir program");
        }
}
