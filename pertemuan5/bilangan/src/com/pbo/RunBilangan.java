package com.pbo;

public class RunBilangan {
    public static void main(String[] args) {
        // write your code here
        Bilangan obil = new Bilangan();
        System.out.println("Nilai A = " + obil.tampilkanA());
        System.out.println("Nilai B = " + obil.tampilkanB());
        System.out.println("Nilai C = " + obil.tampilkanC());

        //nilai A input
        obil.inputA(100);
        System.out.println("Nilai A setelah diinput = " + obil.tampilkanA());
        //nilai B input
        obil.inputB(200);
        System.out.println("Nilai B setelah diinput = " + obil.tampilkanB());
        //nilai C input
        obil.inputC(300);
        System.out.println("Nilai C setelah diinput = " + obil.tampilkanC());

        //panggil method tambah
        System.out.println("Hasil Pertambahan = " + obil.tambah());
        //panggil method pengurangan
        System.out.println("Hasil Pengurangan = " + obil.pengurangan());
        //panggil method perkalian
        System.out.println("Hasil Perkalian = " + obil.perkalian());
        //panggil method pembagian
        System.out.println("Hasil Pembagian = " + obil.pembagian());

        //method inputData
        obil.inputData(3, 5, 2);
        System.out.println("Hasil Pertambahan = " + obil.tambah());
    }
}

