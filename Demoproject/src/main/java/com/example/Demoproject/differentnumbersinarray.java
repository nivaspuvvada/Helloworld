package com.example.Demoproject;
import java.util.Arrays;
public class differentnumbersinarray {
    public static void main(String[] args){
        int numbers1[]={1,2,3,4,5,6};

        int numbers2[]=Arrays.copyOf(numbers1,numbers1.length);

        Arrays.fill(numbers1,6);
        System.out.println(Arrays.toString(numbers1));
        System.out.println(Arrays.toString(numbers2));

    }
}
