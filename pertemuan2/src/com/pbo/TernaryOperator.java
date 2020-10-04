package com.pbo;

import java.util.*;

public class TernaryOperator {

    public static void main(String[] args) {
        int input,x;

        System.out.println("TERNARY OPERATOR");
        Scanner inputUser = new Scanner(System.in);
        System.out.println("Masukkan Nilai : ");
        input = inputUser.nextInt();

        //variabel x = ekspresi ? statement_true : statement_false
        x = (input == 10) ? (input*input) : (input/2);
        /*jika memakai if
           if (input==10)
           {
                x = input*input;
           } else
           {
                x = input/2;
           }
         */

        System.out.println("Hasilnya " + x);
    }
}
