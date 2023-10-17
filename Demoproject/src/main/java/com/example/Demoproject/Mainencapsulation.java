package com.example.Demoproject;

public class Mainencapsulation {
    public static void main(String[] args){
        car car=new car("Tesla","Model y",2023);

        car.setmodel("Model x");
        System.out.println(car.getmake());
        System.out.println(car.getModel());
        System.out.println(car.getyear());
    }
}
