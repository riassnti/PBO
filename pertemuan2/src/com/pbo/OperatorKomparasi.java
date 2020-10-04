package com.pbo;

public class OperatorKomparasi {

        public static void main(String[] args) {

        int a,b;
        boolean hasilKomparasi;

        System.out.printf("----Operator Equal atau Persamaan----\n");
        a = 10;
        b = 10;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d --> %s\n",a,b,hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d --> %s\n",a,b,hasilKomparasi);

        System.out.printf("----Operator Not Equal atau Pertidaksamaan----\n");
        a = 10;
        b = 10;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d --> %s\n",a,b,hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d --> %s\n",a,b,hasilKomparasi);

        System.out.printf("----Operator Less than atau Kurang dari----\n");
        a = 9;
        b = 10;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d --> %s\n",a,b,hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d --> %s\n",a,b,hasilKomparasi);

        System.out.printf("----Operator Greater than atau Lebih dari----\n");
        a = 9;
        b = 10;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d --> %s\n",a,b,hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d --> %s\n",a,b,hasilKomparasi);

        System.out.printf("----Operator Less than Equal atau Kurang Dari Sama Dengan----\n");
        a = 9;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s\n",a,b,hasilKomparasi);

        a = 10;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s\n",a,b,hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s\n",a,b,hasilKomparasi);

        System.out.printf("----Operator Greater than Equal atau Lebih Dari Sama Dengan----\n");
        a = 9;
        b = 10;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s\n",a,b,hasilKomparasi);

        a = 10;
        b = 10;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s\n",a,b,hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s\n",a,b,hasilKomparasi);
    }
}

