package com.pbo;

//code from filname Person.java
//abstract class
abstract class Person {
    public String fname = "John";
    public int age = 24;
    public abstract void study(); //abstract method
}

//subclass (inherit from person)
class Student extends Person {
    public int graduationYear = 2018;
    public void study() { //the body of the abstract method is provided here
        System.out.println("Studying all day long");
    }
}
//end code from filename Person.java


