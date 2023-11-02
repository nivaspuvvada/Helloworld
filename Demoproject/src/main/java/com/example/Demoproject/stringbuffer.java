package com.example.Demoproject;

public class stringbuffer {
    public static void main(String[] args){
        int str;
        StringBuffer sb=new StringBuffer("Janaki Nivas");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append(" Rao");
        System.out.println(sb);

        sb.deleteCharAt(5);
        System.out.println(sb);

        sb.insert(0, "Hi ");
        System.out.println(sb);


    }
}
