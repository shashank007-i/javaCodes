package array.arrayindex;

import java.util.Scanner;

public class sumarray
{
    public static void main(String[] args) {
        int sum=0;
        Scanner scan= new Scanner(System.in);
        System.out.println("enter size of the array");
        int size= scan.nextInt();
        int arr[]=new int[size];

        System.out.println("enter an array");

        for(int i=0;i < size;i++) {
            arr[i]= scan.nextInt();
        }

       for (int i=0 ;i < size; i++)
        {
            sum = arr[i] + i++;
            System.out.println("sum of the array is \n"+sum);
        }

    }
}
