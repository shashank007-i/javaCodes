package array;

import java.util.Scanner;

public class twodarrayu
{
    public static void main(String[] args) {
        int r,c;

        Scanner scan=new Scanner(System.in);
        System.out.print("enter rows and coloums\n");

        r= scan.nextInt();
        c= scan.nextInt();
        int arr[][]=new int[r][c];;

        System.out.println("enter the array\n");


        for(int i=0; i<r ;i++)
        {
            for(int j=0; j<c ;j++)
            {
               arr[i][j]= scan.nextInt();
            }

        }
        System.out.println("array is\n");
        for(int i=0;i<r; i++){
            for (int j=0; j<c; j++)
            {
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }


    }

}
