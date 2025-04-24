package matrixtranspose;

import java.util.Scanner;

public class transposeofamatrix
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();

        int matrix[][]= new int[n][m];

        for (int i=0 ;i<=n ;i++){
            for (int j=0;j <=m;j++){
                matrix[i][j]= sc.nextInt();
            }
        }

        //transpose output
        for (int i=0;i<=n;i++){
            for (int j=0;j<=m;j++){
                matrix[i][j]= sc.nextInt();
                System.out.println("transpose of the matrix is"+matrix);
            }
            System.out.println();
        }


    }
}
