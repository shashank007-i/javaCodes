package forlooppencil;

import java.util.Scanner;

public class pencilcount
{
    public static void main(String[] args) {
        double first,second,third,n;
        int std;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your std");
        std= scan.nextInt();
        if(std>=12)
            System.out.println("invalid std");
        else{
            int sum=0;
            for(int i=1;i<=std;i++)
            {
                sum = sum + i * i;
            }
            System.out.println("pencil count is "+sum);
        }

    }
}
