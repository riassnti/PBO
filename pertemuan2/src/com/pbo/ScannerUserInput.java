package com.pbo;

import java.util.Scanner;

public class ScannerUserInput {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int panjang, lebar, luas, tinggi, volume;
        //MENGHITUNG LUAS PERSEGI PANJANG
        //luas = panjang * lebar

        System.out.println("MENGHITUNG LUAS");
        System.out.println("panjang = ");
        panjang = userInput.nextInt();
        System.out.println("lebar = ");
        lebar = userInput.nextInt();

        luas = panjang * lebar;
        System.out.println("Luas = " + luas);

        System.out.println("MENGHITUNG VOLUME");
        System.out.println("tinggi = ");
        tinggi = userInput.nextInt();
        volume = luas * tinggi;
        System.out.println("Volume = " + volume);
    }
}
