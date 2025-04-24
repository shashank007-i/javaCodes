package SIMPLE_CALCULATOR;

import java.util.Scanner;

public class miniproject
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Here's a simple calculator");
        System.out.println("enter the first number");
        double lnum1= sc.nextDouble();
        System.out.println("enter the second number");
        double lnum2= sc.nextDouble();

        System.out.println("choose the operation to do");
        System.out.println("1.ADDITION(+)\n2.SUBTRACTION(-)\n3.MULTIPLICATION(*)\n4.DIVISION(/)");
        System.out.print("enter your choice(1-4):");
        int choice= sc.nextInt();

        double result=0;
        boolean valid=true;

        switch(choice){
            case 1:
                result= lnum1 + lnum2;
                break;
            case 2:
                result= lnum1 - lnum2;
                break;
            case 3:
                result= lnum1 * lnum2;
            case 4:
                if (lnum2 != 0){
                    result = lnum1 / lnum2;
                }else {
                    System.out.println("ERROR:Cannot divide by zero.");
                    valid=false;
                }
                break;
            default:
                System.out.println("invalid choice");
                valid=false;
        }
        if (valid){
            System.out.println("result:"+result);
        }

    }
}
