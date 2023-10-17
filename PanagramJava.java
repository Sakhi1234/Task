import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a string ");
        String str=scn.nextLine();
        boolean flag=true;
        str=str.toLowerCase();
        for(char ch='a';ch<='z';ch++){
            if(!str.contains(String.valueOf(ch))){
                flag=false;
                break;
            }
        }
        if(!flag) System.out.println("String is not panagram");
        else System.out.println("String is panagram");
    }
}
