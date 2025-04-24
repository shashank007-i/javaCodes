package ifelsevoting;

import java.util.Scanner;

public class votingeligibility {
    public static void main(String[] args) {
        int year,age,diffage;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your birth year");


        year = scan.nextInt();
        age = 2024 - year;
        if (age >= 18) {
            System.out.println("you can vote");
        }
        else {
                diffage = 18 - age;
            System.out.println("you are not eligible to vote you can vote after" + diffage + "years");
        }
    }
}