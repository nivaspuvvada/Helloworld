package com.example.Demoproject;
import java.util.Scanner;
public class calculatorusingswitchcase {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the first Number: ");
        double number1=scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter the second Number: ");
        double number2=scanner.nextDouble();
        scanner.nextLine();

        System.out.print("what operation we want: ");
        String operation=scanner.nextLine();

        switch(operation){
            case "sum":
                System.out.printf("%f+%f=%f",number1,number2,number1+number2);
                break;
            case "sub":
                System.out.printf("%f-%f=%f",number1,number2,number1-number2);
                break;
            case "mul":
                System.out.printf("%f*%f=%f",number1,number2,number1*number2);
                break;
            case "div":
                if(number2 ==0){
                    System.out.printf("print 0");
                }
                else
                {
                    System.out.printf("%f/%f=%f",number1,number2,number1/number2);
                }
                break;
            default:
                System.out.printf("%s isn't a operation",operation);

        }

    }
}
