
package stringsreplacement;

import java.util.Scanner;

public class etoi {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = "";

        for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == 'e') {
                    result += 'i';
                } else {
                    result += str.charAt(i);
                }
            }
            System.out.print(result);
        }
    }
