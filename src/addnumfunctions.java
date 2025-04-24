import java.util.Scanner;

public class addnumfunctions
{
    public static int calculatesum(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int a= scan.nextInt();
        int b= scan.nextInt();
        int sum = calculatesum(a,b);

        System.out.println("sum of two numbers:"+sum);
    }
}
