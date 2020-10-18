package com.pbo;

//Create a JavaConstructors class
public class JavaConstructors {
    int x; //Create a class attribute

    //Create a class construtor for the JavaConstructors class
    public  JavaConstructors() {
        x = 5; //Set the initial value for the class attribute x
    }

    public static void main(String[] args) {
        JavaConstructors myObj = new JavaConstructors(); //Create an object of class JavaConstructors (This will call the construtor)
        System.out.println(myObj.x); //Print the value of x
    }
}
//Output 5
