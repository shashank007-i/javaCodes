package enterbalance;

import java.util.Scanner;

public class atmmini
{
    public static void main(String[] args) {
        int ch;
        float balance,currbal,withdraw,deposit;
        Scanner scan= new Scanner(System.in);
        System.out.println("enter your balance");
        balance= scan.nextFloat();
        System.out.println("1.withdraw\n2.deposit");
        ch = scan.nextInt();

        switch (ch)
        {

            case 1:
                System.out.println("enter amount to withdraw");
                withdraw = scan.nextFloat();
                currbal = balance - withdraw;
                System.out.println("withdraw success current balance is"+currbal);
                break;

            case 2:
                System.out.println("enter amount to deposit");
                deposit = scan.nextFloat();
                currbal = balance + deposit;
                System.out.println("deposit success current balance is"+currbal);
                break;





        }

    }
}
