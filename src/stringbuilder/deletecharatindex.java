package stringbuilder;

import java.util.Scanner;

public class deletecharatindex
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder("tony");

        //delete function
        sb.delete(0,2);
        System.out.println(sb);
    }
}
//in the delete function the index written as (0,2)
// in this case the 0th index will get deleted till
// the index 1 but the index placed on the 2 nd place
// will remain the same the index will only vary till
// the preceding index in the string
