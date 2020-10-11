package com.pbo;

public class ReturnValuesTiga {
    static int myMethod(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        int z = myMethod(5,3);
        System.out.println(z);
    }
}
//outputs 8 (5 + 3)