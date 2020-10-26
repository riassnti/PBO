package com.pbo;

public class Kendaraan {
    //Atribut
    private String merek;
    //Constructor
    public Kendaraan(String merek) {
        this.merek = merek;
    }
    //Getter&Setter
    protected String getMerek() { //private tidak bisa diturunkan di kelas anak dan kelas lainnya. sedangkan protected bisa diturunkan di kelas anak tapi harus 1 package
        return merek;
    }
    public void setMerek(String merek) {
        this.merek = merek;
    }
}
