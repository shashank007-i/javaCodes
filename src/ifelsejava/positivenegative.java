package ifelsejava;

import java.util.Scanner;

public class positivenegative {
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter any number");
        num = scan.nextInt();
        if (num > 0)
            System.out.println("positive");
        else if (num < 0){
            System.out.println("negative");
        }
        else if(num == 0)
            System.out.println("zero");

    }
}
