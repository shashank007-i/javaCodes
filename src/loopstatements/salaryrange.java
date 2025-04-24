package loopstatements;

import java.util.Scanner;

public class salaryrange
{
    public static void main(String[] args)
    {
        float sal,per;

        Scanner scan = new Scanner(System.in);
        System.out.println("enter your salary");

        sal= scan.nextInt();
        if(sal >= 100001 && sal <= 200001)
            per = (float) (sal % 0.1);
        System.out.println("your tax is %f");
    }
}
