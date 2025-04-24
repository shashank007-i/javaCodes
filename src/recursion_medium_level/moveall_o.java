package recursion_medium_level;

import java.util.Scanner;

public class moveall_o {
    public static void moveO(String str, int idx, int count, String newString) {
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newString += 'o';
            }
            System.out.println(newString);
            return;
        }
        char currchar = str.charAt(idx);
        if (currchar == 'o') {
            count++;
            moveO(str, idx + 1, count, newString);
        } else {
            newString += currchar;
            moveO(str, idx + 1, count, newString);

        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String str = sc.next();
        moveO(str, 0, 0, "");

    }
}