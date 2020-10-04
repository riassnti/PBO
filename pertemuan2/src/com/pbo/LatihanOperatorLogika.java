package com.pbo;

import java.util.*;

public class LatihanOperatorLogika {

    public static void main(String[] args) {
        //membuat sebuah objek untuk menangkap input dari user
        Scanner inputUser = new Scanner(System.in);

        System.out.println("PROGRAM SEERHANA UNTUK MENEBAK SEBUAH ANGKA");

        int nilaiBenar = 9;
        int nilaiTebakan;
        boolean statusTebakan;
        System.out.println("Masukkan Nilai Tebakan Anda : ");
        nilaiTebakan = inputUser.nextInt();
        System.out.println("Nilai Tebakan Anda Adalah : " + nilaiTebakan);

        //Operasi Logika
        statusTebakan = (nilaiTebakan == nilaiBenar);
        System.out.println("Tebakan Anda : " + statusTebakan);

        //Operasi Aljabar Boolean (and / or)
        System.out.println("Masukkan Nilai Diantara 4 dan 9");
        nilaiTebakan = inputUser.nextInt();
        statusTebakan = (nilaiTebakan > 4) && (nilaiTebakan < 9);
        /*
            a | b | c
            0   0   0
            0   1   0
            1   0   0
            1   1   1
         */
        System.out.println("Tebakan Anda : " + statusTebakan);
    }
}
