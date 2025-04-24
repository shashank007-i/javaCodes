package ifelsenum;

import java.util.Scanner;

public class oddeven
{
    public static void main(String[]args) {
        int num,odd,even;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter any number");
        num = scan.nextInt();

        if ( num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

    }
    }
