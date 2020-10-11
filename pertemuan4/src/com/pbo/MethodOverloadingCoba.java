package com.pbo;

public class MethodOverloadingCoba {
    static int plusMethod(int x, int y) {
        return x + y;
    }
    static double plusMethod(double x, double y) {
        return x + y;
    }
    static String plusMethod(String x, String y) {
        String hasil = x + " " + y; //variabel lokal
        return hasil;
    }
    static String plusMethod(String x, int y) {
        String hasil = "Nama " + x + ", umur " + y + " tahun";
        return hasil;
    }

    public static void main(String[] args) {
        String myNum3 = plusMethod("Ria", "Susanti");
        int myNum1 = plusMethod(10, 9);
        double myNum2 = plusMethod(4.3, 6.26);
        String myNum4 = plusMethod("Ria", "19");
        System.out.println("Nilai int: " + myNum1);
        System.out.println("Nilai double: " + myNum2);
        System.out.println("Nilai String = " + myNum3);
        System.out.println("keterangan = " + myNum4);
        System.out.println("Nama " + myNum3 + " umur " + myNum1 + " tahun"); //Nama Ria, umur 19 tahun
    }
}
