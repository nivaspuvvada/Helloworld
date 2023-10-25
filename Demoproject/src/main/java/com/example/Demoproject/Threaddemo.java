package com.example.Demoproject;

class hey extends Thread {
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println("hey");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }

}


class hello extends Thread {
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }

}

public class Threaddemo{
    public static void main(String[] args){
        hey obj1=new hey();
        hello obj2=new hello();

        obj1.start();
        try {
            Thread.sleep(1000);
        }
        catch(Exception ignored){}
        obj2.start();

    }

}


