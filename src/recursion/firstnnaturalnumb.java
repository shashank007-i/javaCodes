package recursion;

import java.awt.*;
import java.util.Scanner;

public class firstnnaturalnumb
{
    public static void printsum(int i,int n,int sum){
        if(i == n){
            sum += i;
            System.out.print(sum);
            return;
        }
        sum += i;
        printsum(i+1,n,sum);

    }
    public static void main(String args[]){
        printsum(1 ,3 ,0);
    }
}
