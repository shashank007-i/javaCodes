package stringbuilder;

import java.util.Scanner;

public class appendfunction
//append function means to add something onto the last
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder("tony");
        sb.append("stark");
        System.out.println(sb);
    }
}
