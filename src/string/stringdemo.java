package string;

import java.util.Scanner;

public class stringdemo
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter name");
        String s= scan.next();
        StringBuilder sb= new StringBuilder(s);
        sb.reverse();

        s=sb.toString();
        System.out.println(s);
    }
}
