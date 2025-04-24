package mulfuctionreturn;

import java.util.Scanner;

public class multiplyreturn {
    public static int multiply(int a,int b){
        int mul= a * b;
        return mul;

    }
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int mul= multiply(a,b);

        System.out.println("multiplication of two number is"+mul);
    }
}
