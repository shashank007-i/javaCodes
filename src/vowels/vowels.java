package vowels;

import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
        char ch= 'a';
        


        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");
    }
}