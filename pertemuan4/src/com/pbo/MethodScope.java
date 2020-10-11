package com.pbo;

public class MethodScope {
    public static void main(String[] args) {
        //code here canot use x

        int x = 100;

        //code here can use x
        System.out.println(x);
    }
}
