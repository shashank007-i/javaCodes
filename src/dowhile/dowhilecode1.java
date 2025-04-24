package dowhile;

import java.util.Scanner;

public class dowhilecode1 {
    public static void main(String[] args) {
        char ch;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("file printed succesfully");
            System.out.println("do you wish to print again");
            ch = scan.next().charAt(0);
            if(ch == 'n')
                break;
        }while(true);
        System.out.println("out of loop");
    }
}