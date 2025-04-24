package recursion_medium_level;

public class print_permutations {

    public static void printperm(String str,String permutation){
        if (str.length() == 0){
            System.out.println(permutation);
            return;
        }
        for (int i=0;i<str.length();i++){
            char currchar=str.charAt(i);

            String newstring= str.substring(0,i)+str.substring(i+1);
            printperm(newstring,permutation+currchar);
        }
    }
    public static void main(String args[]){
        String str="abc";
        printperm(str,"");
    }
}
