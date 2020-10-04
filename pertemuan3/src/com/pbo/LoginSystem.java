package com.pbo;

import java.util.Scanner;

public class LoginSystem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String user, pass;
        int a = 0;

        do {
            a++;
            System.out.println("Enter your username : ");
            user = input.nextLine();

            System.out.println("Enter your password : ");
            pass = input.nextLine();

            System.out.println("-----------------------------------------");

            if ((user.equals("Ria")) && (pass.equals("Susanti"))) {
                System.out.println("===Username dan password benar===");
                {
                    break;
                }
            } else if ((user.equals("Hadi")) && (pass.equals("Rama"))) {
                System.out.println("===Username dan password benar===");
                {
                    break;
                }
            } else if ((user.equals("Rusli")) && (pass.equals("Susanto"))) {
                System.out.println("===Username dan password benar===");
                {
                    break;
                }
            } else {
                System.out.println("Maaf, username atau password salah");
            }
        } while (!(user.equals("username") && pass.equals("password")));
    }
}

