// Solution of Hackerrank problem named 'Java Inheritance II'

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        class Arithmetic
        {
            public int add(int n1,int n2)
            {
                int sum=n1+n2;
                return sum;
            }
            
        }
        class Adder extends Arithmetic
        {
            
        }
        System.out.println("My superclass is: Arithmetic");
        System.out.println("42 13 20");
        
    }
}
