import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
             int n=sc.nextInt();
             Integer i1=n;
             String s=i1.toString();
             String s1=s.getClass().getSimpleName();
             if(s1.equals("String"))
             {
                 System.out.println("Good job");
             }
             else
             {
                 System.out.println("Wrong answer");
             }
         
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
