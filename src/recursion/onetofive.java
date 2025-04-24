package recursion;

public class onetofive
{
    public static void printnumb(int n){
        if (n == 6){
            return;
        }
        System.out.print(n);
        printnumb(n+1);
    }
    public static void main(String args[]){
        int n =1;
        printnumb(n);
    }
}
