package ifelseif;

import java.util.Scanner;

public class season
{
    public static void main(String[] args)
    {
        int month;
        Scanner scan= new Scanner(System.in);
        System.out.println("enter month no");

        month = scan.nextInt();

        if(month >=3 && month <=5)
            System.out.println("summer");
        else if(month >=6 && month <=8)
            System.out.println("rainy");

        else if(month >=9 && month <=11)
        System.out.println("winter");

        else
                System.out.println("autum");




    }
}
