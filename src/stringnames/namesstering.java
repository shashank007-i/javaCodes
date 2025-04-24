package stringnames;

import java.util.Scanner;

public class namesstering {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int size= scan.nextInt();
        String names[]=new String[size];

        for (int i=0;i<size;i++){
            names[i]= scan.next();
        }
        for (int i=0;i<names.length;i++){
            System.out.println("names are"+ (i+1) +names[i]);
        }

    }



}




