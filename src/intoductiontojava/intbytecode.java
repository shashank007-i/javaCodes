package intoductiontojava;

import java.util.Scanner;

public class intbytecode
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        byte x1;
        short x2;
        int x3;
        long x4;
        float x5;
        double x6;
        char x7;
        int data;

        boolean flag;
        String name;
        String aboutme;
        System.out.println("enter the byte value for x1:" );
        x1= sc.nextByte();

        System.out.println("enter the short value for x2:");
        x2= sc.nextShort();

        System.out.println("enter the int value for x3:");
        x3= sc.nextInt();

        System.out.println("enter the long value for x4:");
        x4=sc.nextLong();

        System.out.println("enter the float value for x5:");
        x5=sc.nextFloat();

        System.out.println("enter the double value for x6:");
        x6=sc.nextDouble();

        System.out.println("enter the  char value for x7:");
        x7=sc.next().charAt(0);

        System.out.println("enter the boolean value for flag:");
        flag = sc.hasNextBoolean();

        System.out.println("Enter your name:");
        name= sc.next();

        System.out.println("data provided by user");
        data= sc.nextInt();
        System.out.println("byte:"+ x1);
        System.out.println("short:"+ x2);
        System.out.println("integer:"+ x3);
        System.out.println("long:"+ x4);
        System.out.println("float:"+ x5);
        System.out.println("double:"+ x6);
        System.out.println("Char:"+ x7);

        System.out.println("Flag:"+ flag);
        System.out.println("String:"+ name);
        System.out.println("String:"+ data);


     }
}
