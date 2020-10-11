package com.pbo;

public class ReturnValuesSatu {
    static int myMethod(int x) {
        return 5 + x;
    }

    public static void main(String[] args) {
        System.out.println(myMethod(3));
    }
}
//outputs 8 (5 + 3)
