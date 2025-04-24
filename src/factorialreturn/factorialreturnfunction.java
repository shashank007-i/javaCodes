package factorialreturn;

import java.util.Scanner;

public class factorialreturnfunction {
    public static void printfactorial(int n) {
        int factorial = 1;
        if (n <=0){
            System.out.print("invalid input");
        }
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;

        }
        System.out.println(factorial);
        return;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();

        printfactorial(n);


    }
}