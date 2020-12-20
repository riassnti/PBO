package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    private String pesan;
    private String bilangan1, bilangan2;
    private String hasil;

    public TextField text_pesan;
    public Label label_pesan;
    public TextField text_bilangan1;
    public TextField text_bilangan2;
    public Label label_hasil;


    public void buttonPesanKlik(ActionEvent actionEvent) {
        pesan = text_pesan.getText();
        String cetak = pesan;
        label_pesan.setText(cetak);
    }

    public void buttonBagiKlik(ActionEvent actionEvent) {
        bilangan1 = text_bilangan1.getText();
        bilangan2 = text_bilangan2.getText();
        double bil1 = Double.parseDouble(bilangan1);
        double bil2 = Double.parseDouble(bilangan2);
        double hasil = bil1 / bil2;
        String cetak = bil1 + " : " + bil2 + " = " + hasil;
        label_hasil.setText(cetak);
    }

    public void buttonKaliKlik(ActionEvent actionEvent) {
        bilangan1 = text_bilangan1.getText();
        bilangan2 = text_bilangan2.getText();
        double bil1 = Double.parseDouble(bilangan1);
        double bil2 = Double.parseDouble(bilangan2);
        double hasil = bil1 * bil2;
        String cetak = bil1 + " x " + bil2 + " = " + hasil;
        label_hasil.setText(cetak);
    }

    public void buttonTambahKlik(ActionEvent actionEvent) {
        bilangan1 = text_bilangan1.getText();
        bilangan2 = text_bilangan2.getText();
        double bil1 = Double.parseDouble(bilangan1);
        double bil2 = Double.parseDouble(bilangan2);
        double hasil = bil1 + bil2;
        String cetak = bil1 + " + " + bil2 + " = " + hasil;
        label_hasil.setText(cetak);
    }

    public void buttonKurangKlik(ActionEvent actionEvent) {
        bilangan1 = text_bilangan1.getText();
        bilangan2 = text_bilangan2.getText();
        double bil1 = Double.parseDouble(bilangan1);
        double bil2 = Double.parseDouble(bilangan2);
        double hasil = bil1 - bil2;
        String cetak = bil1 + " - " + bil2 + " = " + hasil;
        label_hasil.setText(cetak);

    }

    public void buttonHapusKlik(ActionEvent actionEvent) {
        String cetak = "  ";
        label_hasil.setText(cetak);
        text_bilangan1.setText(cetak);
        text_bilangan2.setText(cetak);
    }
}