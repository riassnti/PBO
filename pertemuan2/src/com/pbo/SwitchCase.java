package com.pbo;

import java.util.*;

public class SwitchCase {

    public static void main(String[] args) {
        System.out.println("SWITCH CASE");

        String input;
        Scanner inputUser = new Scanner(System.in);

        System.out.println("Panggil nama : ");
        input = inputUser.next();

        //ekspresinya berupa satuan (int, long, byte short), String atau enum
        switch (input) {
            case "otong":
                System.out.println("Saya otong dan hadir bos!!!");
                break;
            case "ucup":
                System.out.println("Saya ucup dan hadir bos!!!");
                break;
            case "mario":
                System.out.println("Saya mario dan hadir bos!!!");
                break;
            default:
                System.out.println(input + " tidak hadir bos!!!");
        }
        System.out.println("----PROGRAM SELESAI----");
    }
}
