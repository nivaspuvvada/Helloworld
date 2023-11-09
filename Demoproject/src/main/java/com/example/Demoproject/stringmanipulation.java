package com.example.Demoproject;

public class stringmanipulation {
    public static void main(String[] args){
        String str1 = "Janaki Nivas";
        String str2 = " Rao";
        String str3 = str1.concat(str2);
        System.out.println(str3);

        String str="Nivas";
        System.out.println("Length of String: " + str.length());

        String str_Sample1 = "Janaki";
        System.out.println("Character at position 4: " + str_Sample1.charAt(4));
        System.out.println("Index of character 'n': " + str_Sample1.indexOf('n'));

        String str_Sample2 = "Nivas";
        System.out.println("Contains sequence 'tar': " + str_Sample2.contains("va"));
        System.out.println("Contains sequence 'tar': " + str_Sample2.contains("cd"));


        String str_Sample3 = "Janaki";
        System.out.println("Replace 'Janaki' with 'Puvvada': " + str_Sample3.replace("Janaki", "Puvvada"));

        String str_Sample4 = "Nivas";
        System.out.println("Convert to LowerCase: " + str_Sample4.toLowerCase());
        System.out.println("Convert to UpperCase: " + str_Sample4.toUpperCase());

        String str5= " Puvvada";
        String str6=str3 + str5;
        System.out.println(str6);

    }
}

