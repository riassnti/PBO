package com.pbo;

public class Unary {

    public static void main(String[] args) {
        System.out.println("UNARY (OPERASI YANG DILAKUKAN PADA 1 VARIABEL");

        System.out.println("Unary (+) dan (-)");
        int angka = 1;
        System.out.printf("unary (+), %d menjadi %d\n",angka, +angka);
        System.out.printf("unary (-), %d menjadi %d\n",angka, -angka);

        System.out.println("----Unary Decrement dan Increment----");
        System.out.println("1. Unary Decrement");
        int angka2 = 10;
        angka2--;
        System.out.println("nilai dengan (--) menjadi = " + angka2);

        System.out.println("2. Unary Increment");
        int angka3 = 10;
        angka3++;
        System.out.println("nilai dengan (++) menjadi = " + angka3);

        System.out.println("----Unary Increment Prefix----");
        int a = 5;
        ++a;
        System.out.println("nilai dengan (++) prefix menjadi = " + a);

        System.out.println("----Unary Increment Postfix----");
        int b = 5;
        System.out.printf("nilai dengan (++) postfix menjadi = %d\n", b++);
        System.out.printf("nilai dengan (++) postfix menjadi = %d\n", b);

        System.out.println("----Unary Boolean dengan ! untuk Negasi----");
        boolean ucup = true;
        System.out.println("nilai boolean = " + ucup);
        System.out.println("nilai boolean = " + !ucup);
    }
}
