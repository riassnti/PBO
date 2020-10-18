package com.pbo;

public class MyClass {
    int x = 10;

    public static void main(String[] args) {
        MyClass myObj = new MyClass();
        myObj.x = 25; //x is now 25
        System.out.println(myObj.x);
    }
}