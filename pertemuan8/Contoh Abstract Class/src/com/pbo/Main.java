package com.pbo;
//class Abstract

abstract class Hewan { //Abstract Method (tidak memiliki body)
    public abstract void suaraHewan();
    //Regular Method
    public void tidur() {
        System.out.println("Zzz...");
    }
}
//Subsclass (turunan dari class Hewan)
class Ayam extends Hewan {
    public void suaraHewan() { //Body dari abstract method suaraHewan()
        System.out.println("Kukuruyuk...");
    }
}
class Kucing extends Hewan {
    public void suaraHewan() { //Body dari abstract method suaraHewan()
        System.out.println("Meong...");
    }
}

public class Main {
    public static void main(String[] args) {
        Ayam ayamku = new Ayam(); //membuat object Ayam
        System.out.println("Ayam");
        ayamku.suaraHewan();
        ayamku.tidur();
        System.out.println("Kucing");
        Kucing kucingku = new Kucing(); //membuat object Kucing
        kucingku.suaraHewan();
        kucingku.tidur();
    }
}
