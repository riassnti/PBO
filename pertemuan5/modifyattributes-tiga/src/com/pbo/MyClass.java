package com.pbo;

public class MyClass {
    final int x = 10;

    public static void main(String[] args) {
        MyClass myObj = new MyClass();
        myObj.x = 25; //will generate an error: cannot assign a value to final variable x
        System.out.println(myObj.x);
    }
}
