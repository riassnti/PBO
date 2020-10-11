package com.pbo;

public class ReturnValuesDua {
    static int myMethod(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println(myMethod(5, 3));
    }
}
//outputs 8 (5 + 3)
