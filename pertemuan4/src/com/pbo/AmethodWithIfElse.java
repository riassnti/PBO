package com.pbo;

public class AmethodWithIfElse {
    //create a checkAge() method with an integer variable called age
    static void checkAge(int age) {

        //if age is less than 18, print "access denied"
        if (age<18) {
            System.out.println("Access denied - You are not old enough!");

            //if age is greater than 18, print "access granted"
        } else {
            System.out.println("Access greanted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        checkAge(20); //call the checkAge method and pass along an age of 20
    }
}
//ouputs "Access greanted - You are old enough!"
