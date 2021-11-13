// Solution of Hackerrank problem named 'Java Exception Handling(try-catch)'

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            System.out.println(x/y);
        }
        catch(InputMismatchException obj)
        {
            System.out.println("java.util.InputMismatchException");
        }
        catch(Exception obj)
        {
            System.out.println(obj);
        }
    }
}
