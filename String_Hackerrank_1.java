import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int k=sc.nextInt();
        String s1="";
        //welcomejava
        String small=s.substring(0,k);String large=s.substring(0,k);
        for(int i=1;i<=s.length()-k;i=i+1)
        {
            s1=s.substring(i,i+k);
            if(s1.compareTo(small)<0)
            {
                small=s1;
            }
            if(s1.compareTo(large)>0)
            {
                large=s1;
            }
        }
        System.out.println(small);
        System.out.println(large);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
