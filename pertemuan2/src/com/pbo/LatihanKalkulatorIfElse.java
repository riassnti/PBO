package com.pbo;

import java.util.*;

public class LatihanKalkulatorIfElse {

    public static void main(String[] args){
        System.out.println("LATIHAN KALKULATOR IF ELSE");
        // a operator b
        Scanner inputUser;
        float a,b,hasil;
        char operator;

        inputUser = new Scanner(System.in);

        System.out.print("Nilai a = ");
        a = inputUser.nextFloat();
        System.out.print("Operator = ");
        operator = inputUser.next().charAt(0);
        System.out.print("Nilai b = ");
        b = inputUser.nextFloat();

        System.out.println("Input use: " + a + " " + operator + " " + b);

        // operator tersedia * / + -
        if(operator == '+'){
            // penjumlahan
            hasil = a + b;
            System.out.println("Hasil = " + hasil);
        } else if (operator == '-') {
            //pengurangan
            hasil = a - b;
            System.out.println("Hasil = " + hasil);
        } else if (operator == '*') {
            //perkalian
            hasil = a * b;
            System.out.println("Hasil = " + hasil);
        } else if (operator == '/') {
            //pembagian
            if (b == 0){
                System.out.println("Pembagi nol menghasilkan tak hingga");
            } else {
                hasil = a / b;
                System.out.println("Hasil = " +hasil);
            }
        } else {
            // operator tidak ditemukan
            System.out.println("Operator tidak ditemukan");
        }
    }
}

