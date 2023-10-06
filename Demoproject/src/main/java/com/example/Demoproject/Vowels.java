package com.example.Demoproject;
import ch.qos.logback.core.net.SyslogOutputStream;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Vowels {
    public static void main(String[] args){
        char vowels[]={'u','i','o','a','e'};

        Arrays.sort(vowels);

        int startIndex=0;
        int endingIndex=3;

        char key='i';

        int founditemIndex=Arrays.binarySearch(vowels,startIndex,endingIndex,key);
        System.out.println(Arrays.toString(vowels));
        System.out.println(founditemIndex);

    }
}
