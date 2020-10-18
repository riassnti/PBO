package com.pbo;

public class MyClass {
    final int x = 10;
    final double PI = 3.14;

    public static void main(String[] args) {
        MyClass myObj = new MyClass();
        myObj.x = 50; //will generate error: cannot assign a value to final variable x
        myObj.PI = 25; //will generate error: cannot assign a value to final variable x
        System.out.println(myObj.x );
    }
}
