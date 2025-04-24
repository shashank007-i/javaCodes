package stringbuilder;

import java.util.Scanner;

public class setcharatindexs
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        StringBuilder sb= new StringBuilder("tony");
        sb.setCharAt(0,'p');
        System.out.println(sb);
    }
}
