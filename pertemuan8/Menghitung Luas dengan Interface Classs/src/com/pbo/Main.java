package com.pbo;

interface Luas {
    public void setSisi(double...sisi);
    public double getLuas();
}
class LuasSegitiga implements Luas {
    public double alas;
    public double tinggi;

    @Override
    public void setSisi(double... sisi) {
        this.alas = sisi[0];
        this.tinggi = sisi [1];
    }

    @Override
    public double getLuas() {
        double luas =  0.5 * alas * tinggi;
        return luas;
    }
    public double getAlas() {
        return this.alas;
    }
    public double getTinggi() {
        return this.tinggi;
    }
}
class LuasLingkaran implements Luas {
    public double diameter;

    @Override
    public void setSisi(double... sisi) {
        this.diameter = sisi [0];
    }
    @Override
    public double getLuas() {
        double r = this.diameter/2;
        double luas =  3.14 * r * r ;
        return luas;
    }
    public double getDiameter() {
        return this.diameter;
    }
}

public class Main {
    public static void main(String[] args) {
        LuasSegitiga ls = new LuasSegitiga();
        ls.setSisi(5,2);
        System.out.println("Luas Segitiga = " + ls.getLuas() + " cm ");
        LuasLingkaran ll = new LuasLingkaran();
        ll.setSisi(4);
        System.out.println("Luas Lingkaran = " + ll.getLuas() + " cm ");

    }
}