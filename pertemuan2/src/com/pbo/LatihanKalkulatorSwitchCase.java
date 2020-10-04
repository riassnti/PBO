package com.pbo;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Scanner;

public class LatihanKalkulatorSwitchCase {

    public static void main(String[] args) {
        System.out.println("LATIHAN KALKULATOR SWITCH CASE");
        Scanner inputUser;
        float a,b,hasil;
        String operator;

        inputUser = new Scanner(System.in);

        System.out.print("Nilai a = ");
        a = inputUser.nextFloat();
        System.out.print("Operator = ");
        operator = inputUser.next();
        System.out.print("Nilai b = ");
        b = inputUser.nextFloat();

        switch (operator){
            case "+":
                hasil = a + b;
                System.out.println("Hasil = " + hasil);
                break;
            case "-":
                hasil = a - b;
                System.out.println("Hasil = " + hasil);
                break;
            case "*":
                hasil = a * b;
                System.out.println("Hasil = " + hasil);
                break;
            case "/":
                hasil = a / b;
                System.out.println("Hasil = " + hasil);
                break;
            default:
                System.out.println("operator" + operator + "tidak ditemukan");
        }
    }
}

