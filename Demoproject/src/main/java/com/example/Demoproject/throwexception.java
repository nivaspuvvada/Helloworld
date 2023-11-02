package com.example.Demoproject;


public class throwexception
{
    public static void main(String[] args)
    {
        int j=30;
        int i=1;
        try
        {
            j=18/i;
            if(j==0)
                throw new ArithmeticException("i don't want to print 0");
        }
        catch(ArithmeticException e)
        {
            j=18/1;
            System.out.println("ArithmeticException caught");
        }
        catch(Exception e)
        {
            System.out.println("Exception caught");
        }
        System.out.println(j);

    }
}

