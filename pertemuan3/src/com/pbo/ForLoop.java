package com.pbo;

public class ForLoop {

    public static void main(String[] args) {

     /* for (inisialisasi; kondisi; step nilai){
          aksi;
    */

        System.out.println("FOR LOOP");
        System.out.println("Ini adalah awal program");

        System.out.println("Loop pertama");
        for(int nilai = 0; nilai <= 10 ; nilai++){
            System.out.println("For loop ke-" + nilai);
        }

        System.out.println("Loop kedua");
        for(int nilai = 0; nilai < 10 ; nilai++){
            System.out.println("for loop ke-" + nilai);
        }

        System.out.println("Loop ketiga");
        for(int nilai = 10; nilai >= 5 ; nilai--){
            System.out.println("for loop ke-" + nilai);
        }

        System.out.println("Loop keempat");
        int nilai = 0;
        for(; nilai < 10 ;){
            System.out.println("for loop ke-" + nilai);
            nilai++;
        }
        System.out.println("Ini adalah akhir program");
    }
}

