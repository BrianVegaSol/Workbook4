package com.pluarlsight;

public class Person {
    private String firstname;
    private String lastname;
    private int age;


    public String getFullName() {
        return firstname + " " + lastname;
    }

    public static void SayHi() {
        System.out.println("Hi, I am a person");
    }



}
