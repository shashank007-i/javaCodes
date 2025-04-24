package stringtypes;

import java.util.Scanner;

public class accesingcharinstring {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String firstname = "shashank";
        String secondname = "jagattiwar";

        String fullname = firstname + " " + secondname;
        for (int i = 0; i < fullname.length(); i++) {
            System.out.println(fullname.length());
        }
    }
}
