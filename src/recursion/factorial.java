package recursion;

import java.net.StandardSocketOptions;
import java.util.Scanner;

public class factorial
{
    public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int n1 = factorial(n - 1);
        int fact= n * n1;
        return fact;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n= sc.nextInt();
        int ans=factorial(n);
        System.out.println(ans);
    }
}
