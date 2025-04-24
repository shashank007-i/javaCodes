package recursion_medium_level;

public class sunsequences
{
    public static void subsequences(String str,int idx,String newstring){
        if (idx == str.length()){
            System.out.println(newstring);
            return;
        }
        char currchar=str.charAt(idx);
        //to be;
        subsequences(str,idx+1,newstring+currchar);
        //to not to  be
        subsequences(str,idx+1,newstring);
    }
    public static void main(String args[]){
        String str="def";
        subsequences(str,0,"");


    }




}
