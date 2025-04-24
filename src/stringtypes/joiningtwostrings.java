package stringtypes;

import java.util.Scanner;

public class joiningtwostrings
{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String name= scan.next();
        String firstname="shashank";
        String secondname="jagattiwar";

        String fullname= firstname +" "+secondname;
        System.out.println(fullname.length());
        //length function is used to get the length or number of the chracters placed in the string
    }
}
