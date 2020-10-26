package com.pbo;
import java.util.Scanner;

class Orang {
    //Atribut
    private int umur;
    private String nama;
    private String golDarah;
    //Constructor
    public Orang() {
        this.nama = " ";
        this.umur = 0;
        this.golDarah = " ";
    }
    //Method
    public void setGolDarah(String golDarah) {
        this.golDarah = golDarah;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getGolDarah() {
        return this.golDarah;
    }
    public int getUmur() {
        return this.umur;
    }
    public String getNama() {
        return this.nama;
    }
}
class Pegawai extends Orang {
    private String nip;
    private String jabatan;
    //Constructor
    public Pegawai() {
        this.nip = " ";
        this.jabatan = " ";
    }
    //Method
    public void setNip(String nip) {
        this.nip = nip;
    }
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
    public String getNip() {
        return nip;
    }
    public String getJabatan() {
        return jabatan;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Orang org = new Orang(); untuk class Orang
        String nama;
        String nip;
        String jabatan;
        String golDarah;
        int umur;


        Pegawai peg = new Pegawai();
        System.out.println("Masukkan NIP : ");
        nip = input.nextLine();
        peg.setNip(nip);
        System.out.println("NIP : " + peg.getNip());

        System.out.println("Masukkan nama : ");
        nama = input.nextLine();
        peg.setNama(nama);
        System.out.println("Nama : " + peg.getNama());

        System.out.println("Masukkan jabatan : ");
        jabatan = input.nextLine();
        peg.setJabatan(jabatan);
        System.out.println("Jabatan : " + peg.getJabatan());

        System.out.println("Masukkan golongan darah : ");
        golDarah = input.nextLine();
        peg.setGolDarah(golDarah);
        System.out.println("Golongan Darah : " + peg.getGolDarah());

        System.out.println("Masukkan umur : ");
        umur = input.nextInt();
        peg.setUmur(umur);
        System.out.println("Umur : " + peg.getUmur());


    }
}
