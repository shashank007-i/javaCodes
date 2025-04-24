package fibonacci;

import java.util.Scanner;

public class fibonaccicode
{
    public static void main(String[] args) {
       double f,s,t,n;
       Scanner scan=new Scanner("System.in");
       System.out.print("enter range");
       n= scan.nextDouble();
       f=0;
       s=1;
       System.out.print(f+ " " +s);
       for(int i=1;i<n-2;i++){
           t= f + s;
           System.out.print(" "+ t );
           f = s;
           s = t;
       }
    }
}
