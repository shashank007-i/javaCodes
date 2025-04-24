package electricitybill;

import java.util.Scanner;

public class electricity
{
    public static void main(String[] args) {
        float bill,units;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter units");
        units = scan.nextFloat();

        if (units >= 1 && units <= 100) {
            bill = units * 3;
            System.out.println("your bill is" + bill + "ruppes");
        }
        else if (units >= 101 && units <= 300){
            bill = units * 5;
            System.out.println("your bill is"+ bill+"ruppes");
        }
        else
        {
            bill = units * 7;
            System.out.println("your bill is"+bill+"ruppes");
        }



    }
}
