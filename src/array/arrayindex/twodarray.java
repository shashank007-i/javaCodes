package array.arrayindex;

import java.util.Scanner;

public class twodarray
{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int rows= scan.nextInt();
        int cols = scan.nextInt();
        int[][] numbers=new int[rows][cols];

        //input
        System.out.print("enter the number of rows and coloumns");
        for (int i=0;i<=rows ;i++){
            //coloms
            for(int j=0;j<=cols;j++){
                numbers[i][j]= scan.nextInt();

            }
        }
        //output
        int x= scan.nextInt();
        for (int i=0; i<=rows ;i++){
            for (int j=0 ;j<=cols ;j++){
                if (numbers[i][j] == x){
                    System.out.println("x found at locations"+ i + j);
                }

            }

        }



    }

}
