package recursion_medium_level;

import java.util.Scanner;

public class moveallx{

    public static void moveAllX(String str,int idx,int count,String newstring){

        if (idx == str.length()){
            for (int i=0;i<count;i++){
                newstring += 'x';
            }
            System.out.print(newstring);
            return;
        }
        char currChar = str.charAt(idx);
        if (currChar == 'x'){
            count++;
            moveAllX(str,idx+1,count,newstring);
        }
        else {
            newstring += currChar;
            moveAllX(str,idx+1,count,newstring);
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string ");
        String str= sc.next();
         moveAllX(str,0,0,"");


    }

}