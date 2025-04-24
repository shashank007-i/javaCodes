package averageofthreeno;

import java.util.Scanner;

public class avethreeno {
    public static void main(String[]args){
        int average;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the numbers a ,b ,c");
        int a= scan.nextInt();
        int b= scan.nextInt();
        int c= scan.nextInt();

        int ave = (a + b + c) / 3;

        System.out.println("the average is"+ave);


    }

}
