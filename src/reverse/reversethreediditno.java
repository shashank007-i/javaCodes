package reverse;

import java.util.Scanner;

public class reversethreediditno
{
    public static void main(String[] args) {
        int a,b,c,sum;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter any three digit no");
        int num= scan.nextInt();

        a=(num / 100);
        b=(num / 10);
        c=(num % 10);
          
        System.out.print("reverse order is"+ a + b + c);
    }
}
