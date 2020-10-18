package com.pbo;

public class MyClass {
    int x = 5;

    public static void main(String[] args) {
        MyClass myObj1 = new MyClass();
        MyClass myObj2 = new MyClass();
        myObj2.x = 25;
        System.out.println(myObj1.x); //outputs 5
        System.out.println(myObj2.x); //outputs 2
    }
}
