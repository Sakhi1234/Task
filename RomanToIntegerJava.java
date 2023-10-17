import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a Valid Roman Number");
        String str=scn.next();
        HashMap<Character,Integer> hm=new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        
        int sum=0;
        sum+=hm.get(str.charAt(str.length()-1));
        
         for(int i=str.length()-2;i>=0;i--) {
            int n1 = hm.get(str.charAt(i));
            int n2 = hm.get(str.charAt(i+1));
            if(n1<n2) {
                sum-=n1;
            } else {
                sum+=n1;
            }
        }
        System.out.println("The Integer equivalent is "+ sum);
    }
}
