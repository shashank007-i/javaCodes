package add;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter n1");
        n1 = scan.nextInt();
        System.out.println("enter n2");
        n2 = scan.nextInt();
        n3 = n1 + n2;
        System.out.println("add is" + n3);
    }
}
