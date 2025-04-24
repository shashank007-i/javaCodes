package arrsize;

import java.util.Scanner;

public class arrlength {
    public static void showArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter size of the array");
        int size = scan.nextInt();

        int arr[] = new int[size];

        System.out.println("enter array");
        int i;
        for (i = 0; i < arr.length; i++) {

            arr[i] = scan.nextInt();
        }

        showArray(arr);
    }
}