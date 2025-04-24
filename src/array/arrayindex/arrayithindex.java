package array.arrayindex;

import java.util.Scanner;

public class arrayithindex
{
    public static void main(String[]args){

        Scanner scan=new Scanner(System.in);


        int size= scan.nextInt();
        int numbers[]= new int[size];
        //input

        for(int i=0;i<size;i++){
            numbers[i] = scan.nextInt();


        }
        int x= scan.nextInt();
        //output
        for (int i = 0; i< numbers.length; i++){
             if(numbers[i] == x){
                 System.out.println("x found on the index:" + i);
             }
        }



    }
}
