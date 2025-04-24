package array.arrayindex;

import java.util.Scanner;

public class singledarray
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size = scan.nextInt();
        int arr[]=new int[size];
        System.out.println("enter an array");
        for(int i=0; i<size; i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("array is");
        for(int i=0 ;i<size;i++){
            System.out.println(arr[i]+" ");

        }

    }
}
