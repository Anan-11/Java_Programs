import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=n;i++)
        {
            String s=sc.nextLine();
            if(s.length()>=8 && s.length()<=30)
            {
               
                if(Pattern.matches("[a-zA-Z][a-zA-Z_0-9]*",s))
                System.out.println("Valid");
                else
                System.out.println("Invalid");
            }
            else
            {
                System.out.println("Invalid");
            }
        }
    }
}
