package com.pbo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.sql.ResultSet;

public class DataMahasiswaController<nim, nama, umur, jurusan> {
    private String nim, nama, jurusan;
    private int umur;

    public Label labelNim;
    public Label labelNama;
    public Label labelUmur;
    public Label labelJurusan;
    public TextField textNim;
    public TextField textNama;
    public TextField textUmur;
    public TextField textJurusan;


    private KoneksiDataMahasiswa koneksi = new KoneksiDataMahasiswa();

    public void buttonSubmitOnClick(ActionEvent actionEvent) {
        String nim = textNim.getText();
        labelNim.setText(nim);

        String nama = textNama.getText();
        labelNama.setText(nama);

        String umur = textUmur.getText();
        labelUmur.setText(umur);

        String jurusan = textJurusan.getText();
        labelJurusan.setText(jurusan);

        //Input data ke tabel pesan di database pbo-reguler
        String query = "INSERT INTO mahasiswa(nim, nama, umur, jurusan ) VALUES('" + nim + "','" + nama + "','" + umur + "','" + jurusan +  "')";
        int hasil = koneksi.manipulasiData(query);
        if (hasil == 1) {
            System.out.println("Data berhasil diinput ke dalam tabel");
            tampilData();
        }
    }

    public void tampilData() {
        try {
            // Untuk menampilkan data dari database
            String query = "SELECT * FROM mahasiswa";
            ResultSet hasil = koneksi.getData(query);
            ObservableList<String> items = FXCollections.observableArrayList();

            while (hasil.next()) {
                items.add(hasil.getString(4));
            }
        } catch (Exception e) {
            System.out.println("Error : " + e);

        }
    }
}
