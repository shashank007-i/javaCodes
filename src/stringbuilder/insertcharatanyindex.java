package stringbuilder;

import java.util.Scanner;

public class insertcharatanyindex {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder("tony");

        //insert char
        sb.insert(0,'s');
        System.out.println(sb);
    }
}
