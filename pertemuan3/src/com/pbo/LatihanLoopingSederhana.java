package com.pbo;

import java.util.*;

public class LatihanLoopingSederhana {

    public static void main(String[] args) {

        System.out.println("PROGRAM UNTUK MENJUMLAHKAN ANGKA DENGAN RENTANG");

        int nilaiAwal, nilaiAkhir, total;

        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukan nilai awal = ");
        nilaiAwal = inputUser.nextInt();
        System.out.print("Masukan nilai akhir = ");
        nilaiAkhir = inputUser.nextInt();

        total = 0;

        while(nilaiAwal <= nilaiAkhir){
            total = total + nilaiAwal;
            System.out.println("ditambah " + nilaiAwal + " menjadi " + total);
            nilaiAwal++;
        }
    }
}
