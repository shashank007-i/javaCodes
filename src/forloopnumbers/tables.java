package forloopnumbers;

import java.util.Scanner;

public class tables
{
    public static void main(String[] args) {
        int num;
        Scanner scan=new Scanner(System.in);

        System.out.println("enter any number to find the table of it");
        num= scan.nextInt();

        for(int i=1 ; i<=10; i++)
        {
            System.out.print(num * i+ " ");
        }
    }
}
