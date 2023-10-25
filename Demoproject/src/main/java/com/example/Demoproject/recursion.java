package com.example.Demoproject;


public class recursion {
    public static void main(String args[]){
       // System.out.println(factorial(6));
        System.out.println(power(6,8));
    }
    private static int power(int base,int power) {

      //  if (num < 1) return 1;
      //  return num * factorial(num - 1);
        if (power < 1) return 1;
        return base * power(base, power - 1);
    }
}
