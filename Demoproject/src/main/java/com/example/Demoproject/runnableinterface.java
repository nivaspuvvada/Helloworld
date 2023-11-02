package com.example.Demoproject;

class yo implements Runnable {
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println("yo");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }

}
class hai implements Runnable {
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println("hai");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }

}

public class runnableinterface{
    public static void main(String[] args){
        Runnable obj1=new yo();
        Runnable obj2=new hai();

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.start();
        try {
            Thread.sleep(1000);
        }
        catch(Exception ignored){}
        t2.start();

    }

}

