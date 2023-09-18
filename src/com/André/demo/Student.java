package com.André.demo;

public class Student {

    public String name;
    public int age;

    public boolean isTired = true;
    // Add new value later

    // Konstruktor - en metod med samma namn som klassen
    // Value = det som kommer in/ instantiation parameter
    public Student(String name, int age, boolean isTired) {
        this.name = name;
        this.age = age;
        this.isTired = isTired;

    }
}
