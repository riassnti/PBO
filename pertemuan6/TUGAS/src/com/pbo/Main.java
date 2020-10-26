package com.pbo;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

class Orang {
    //Atribut
    private int umur;
    private String nama;
    private String golonganDarah;

    //Constructor
    public Orang() {
        this.nama = " ";
        this.umur = 0;
        this.golonganDarah = " ";
    }

    //Method
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
    public void setGolonganDarah(String golonganDarah) {
        this.golonganDarah = golonganDarah;
    }

    public String getNama() {
        return this.nama;
    }
    public int getUmur() {
        return this.umur;
    }
    public String getGolonganDarah() {
        return this.golonganDarah;
    }
}
class Pegawai extends Orang {
    private String nip;
    private String jabatan;
    private int golongan;
    private int jamKerja;
    private int jamLembur;
    private double gajiPokok;
    private double gajiLembur;
    private double totalGajiLembur;
    private double totalGajiBersih;

    //Constructor
    public Pegawai() {
        this.nip = " ";
        this.jabatan = " ";
        this.golongan = 0;
        this.gajiPokok = 0;
        this.jamLembur = 0;
        this.gajiLembur = 0;
        this.totalGajiLembur = 0;
        this.totalGajiBersih = 0;
    }

    //Method
    //SETTER
    public void setNip(String nip) {
        this.nip = nip;
    }
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
    public void setGolongan(int golongan) {
        this.golongan = golongan;
    }
    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    //GETTER
    public String getNip() {
        return nip;
    }
    public String getJabatan() {
        return jabatan;
    }
    public int getGolongan() {
        return golongan;
    }
    public int getJamKerja() {
        return jamKerja;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        String nip;
        String nama;
        String golonganDarah;
        String jabatan;
        int umur;
        int golongan;
        int jamLembur;
        int jamKerja;
        double gajiPokok;
        double gajiLembur;
        double totalGajiLembur;
        double pajakGajiPokok;
        double pajakLembur;
        double totalPajak;
        double tunjanganPengabdian;
        double totalGajiBersih;


        Pegawai peg = new Pegawai();
        System.out.println("Masukkan NIP : ");
        nip = input.nextLine();
        peg.setNip(nip);

        System.out.println("Masukkan nama : ");
        nama = input.nextLine();
        peg.setNama(nama);

        System.out.println("Masukkan golongan darah : ");
        golonganDarah = input.nextLine();
        peg.setGolonganDarah(golonganDarah);

        System.out.println("Masukkan Jabatan : ");
        jabatan = input.nextLine();
        peg.setJabatan(jabatan);

        System.out.println("Masukkan umur : ");
        umur = input.nextInt();
        peg.setUmur(umur);

        System.out.println("Masukkan Golongan : ");
        golongan = input.nextInt();
        peg.setGolongan(golongan);

        System.out.println("Masukkan Jam Kerja : ");
        jamKerja = input.nextInt();
        peg.setJamKerja(jamKerja);

        switch (golongan) {
            case 1:
                gajiPokok = 1486500;
                tunjanganPengabdian = 250000;
                break;
            case 2:
                gajiPokok = 1926000;
                tunjanganPengabdian = 300000;
                break;
            case 3:
                gajiPokok = 2456700;
                tunjanganPengabdian = 350000;
                break;
            case 4:
                gajiPokok = 2899500;
                tunjanganPengabdian = 400000;
                break;
            default:
                gajiPokok = 0;
                tunjanganPengabdian = 0;
        }

        if (jamKerja > 173) {
            jamLembur = jamKerja - 173;
        } else {
            jamLembur = 0;
        }


        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursIndonesia.setDecimalFormatSymbols(formatRp);

        gajiLembur = jamLembur * 20000;
        pajakGajiPokok = 0.005 * gajiPokok;
        pajakLembur = 0.005 * gajiLembur;
        totalPajak = pajakGajiPokok + pajakLembur;
        totalGajiBersih = ((gajiPokok + tunjanganPengabdian + gajiLembur) - totalPajak);


        System.out.println("NIP                     : " + peg.getNip());
        System.out.println("Nama                    : " + peg.getNama());
        System.out.println("Golongan Darah          : " + peg.getGolonganDarah());
        System.out.println("Jabatan                 : " + peg.getJabatan());
        System.out.println("Umur                    : " + peg.getUmur());
        System.out.println("Golongan                : " + peg.getGolongan());
        System.out.println("Gaji Pokok              : " + kursIndonesia.format(gajiPokok));
        System.out.println("Gaji Lembur             : " + kursIndonesia.format(gajiLembur));
        System.out.println("Pajak Gaji Pokok        : " + kursIndonesia.format(pajakGajiPokok));
        System.out.println("Pajak Lembur            : " + kursIndonesia.format(pajakLembur));
        System.out.println("Total Pajak             : " + kursIndonesia.format(totalPajak));
        System.out.println("Tunjangan Pengabdian    : " + kursIndonesia.format(tunjanganPengabdian));
        System.out.println("Gaji yang Diterima      : " + kursIndonesia.format(totalGajiBersih));
    }
}
