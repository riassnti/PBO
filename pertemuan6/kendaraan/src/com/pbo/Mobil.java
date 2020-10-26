package com.pbo;

public class Mobil extends Kendaraan {
    private String model;

    public Mobil(String merek, String model) {
        super(merek); //super yg masuk kelas kendaraan
    }
    public String getModel() {
        return model;
    }

    public void viewData() {
        System.out.println("Merek : " + this.getMerek());
        System.out.println("Model : " + getModel());
    }
}
