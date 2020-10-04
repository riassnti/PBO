package com.pbo;

public class KonversiData {

    public static void main(String[] args) {

        System.out.println("KONVERSI DATA");

        int nilaiInt = 450; //32 bit
        System.out.println("nilai int = " + nilaiInt);

        System.out.println("----Memperluas Rentang ke Tipe Data yang Lebih Besar----");
        long nilaiLong = nilaiInt;
        System.out.println("nilai long = " + nilaiLong);

        System.out.println("----Memperkecil Rentang ke Tipe Data yang Lebih Kecil----");
        byte nilaiByte = (byte) nilaiInt;
        System.out.println("nilai byte = " + nilaiByte);
        System.out.println("nilai max byte = " + Byte.MAX_VALUE);
        System.out.println("nilai min byte = " + Byte.MIN_VALUE);

        System.out.println("----Casting Pembagian----");
        int a = 10;
        float b = 4;
        float c = a/b;
        System.out.printf("%d / %f = %f\n",a,b,c);

        int x = 10;
        int y = 4;
        float z = (float)x / y;
        System.out.printf("%d / %d = %f\n",x,y,z);
    }
}
