package rectangle;

import java.util.Scanner;

public class Rectangle
{
    public static void main(String[] args) {
        int length,width,area;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter length");
        length = scan.nextInt();
        System.out.println("enter width");
        width = scan.nextInt();
        area = length * width;
        System.out.println("area is" + area);
    }
}