package com.example.Demoproject;
import java.util.HashMap;
public class Hashmap {
    public static void main(String[] args){
        HashMap<String,Integer>scores=new HashMap<String,Integer>();
        scores.put("Hindi",80);
        scores.put("Social",85);
        scores.put("science",90);
        scores.forEach((subject,score) ->{
            scores.replace(subject,score -5);
        });
        System.out.println(scores.toString());
    }
}
