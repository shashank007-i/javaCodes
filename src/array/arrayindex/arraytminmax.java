package array.arrayindex;

import java.util.Scanner;

public class arraytminmax
{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int size= scan.nextInt();
        int numbers[]= new int[size];
        System.out.println("enter the numbers");

        for (int i=0;i<size;i++){
            numbers[i]= scan.nextInt();
        }

        int max= Integer.MIN_VALUE;
        int min = Integer.MIN_VALUE;

        for (int i=0;i<numbers.length;i++){
            if (numbers[i] < min){
                min = numbers[i];
            }
            if (numbers[i]>max){
                max = numbers[i];
            }

        }
        System.out.println("largest number is:"+max);
        System.out.println("smallest number is:"+min);
    }
}
