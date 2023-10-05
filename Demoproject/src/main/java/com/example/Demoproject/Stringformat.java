package com.example.Demoproject;

public class Stringformat {
    public static void main(String[] args){
        String name="Nivas";
        String country="India";
        int age=24;
        String college="CSP";
        String state="MN";

        String Stringformat=String.format("My name is %s.I am from %s.My age is %d.My college is %s.I am from %s",name,country,age,college,state);

        System.out.println(Stringformat);

    }


}
