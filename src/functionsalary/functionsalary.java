package functionsalary;

import java.util.Scanner;

public class functionsalary
{
    static float tax(float salary)
    {
        if(salary > 500000){
            return 0.2f * salary;

        }
        else
            return 0;
    }

    public static void main(String[] args) {
        float tax,salary;
        Scanner scan = new Scanner("System.in");
        System.out.println("enter your salary");
        salary = scan.nextFloat();
        System.out.println("tax is rs"+ tax(salary));
    }


    }

