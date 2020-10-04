package com.pbo;

public class OperasiAritmatika {

    public static void main(String[] args) {
        System.out.println("OPERASI ARITMATIKA");

        int variabel1 = 13;
        int variabel2 = 5;
        int hasil;

        System.out.println("----Penjumlahan----");
        hasil = variabel1 + variabel2;
        System.out.println(variabel1 + " + " + variabel2 + " = " + hasil);
        System.out.println("----Pengurangan----");
        hasil = variabel1 - variabel2;
        System.out.println(variabel1 + " - " + variabel2 + " = " + hasil);
        System.out.println("----Perkalian----");
        hasil = variabel1 * variabel2;
        System.out.println(variabel1 + " x " + variabel2 + " = " + hasil);
        System.out.println("----Pembagian----");
        hasil = variabel1 / variabel2;
        System.out.println(variabel1 + " / " + variabel2 + " = " + hasil);

        float a = 13;
        float b = 5;
        float hasilFloat = a/b;
        System.out.println("----Pembagian Pecahan----");
        System.out.println(a + " / " + b + " = " + hasilFloat);
        System.out.println("----Modulus----");
        hasil = variabel1 % variabel2;
        System.out.println(variabel1 + " % " + variabel2 + " = " + hasil);
    }
}
