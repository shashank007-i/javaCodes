package votingjava;

import java.util.Scanner;

public class votingeligible {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter age");
        int a= scan.nextInt();
        if (a <= 18 ){
            System.out.println("you are eligible to vote");

        }
        
    }
}
