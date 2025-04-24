
package recursion_medium_level;

import java.util.Scanner;

public class string_reverse
{//printing the given input in an reverse of that string..
    public static void printrev(String str,int idx){
        if (idx == 0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printrev(str,idx-1);
    }
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string to reverse");
        String str= sc.next();
        printrev(str,str.length()-1);
    }







}