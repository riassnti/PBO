package com.pbo;

class Vehicle {
    protected String brand = "Ford"; //vehicle attribute
    public void honk() { //vehicle method
        System.out.println("Tuut, tuut!");
    }
}

class Car extends Vehicle {
    private String modelName = "Mustang";
    public static void main(String[] args) {

        //create a myCar object
        Car myCar = new Car();

        //call the honk() method (from the Vehicle Class) on the myCar object
        myCar.honk();

        //display the value of the brand attribute (from the Vehicle Class)
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}
