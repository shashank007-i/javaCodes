package stringbuilder;

import java.util.Scanner;

public class printlengthofstring
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder("tony");
        sb.append("stark");
        System.out.println(sb);

        System.out.println(sb.length());
    }
}
