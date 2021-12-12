// creating a generic method which accepts an integer array and a String array only
import java.io.*;
import java.util.*;

class Printer
{
    public static <Integer,String> void printArray(Integer []x,String []y)
    {
        for(Integer a:x)
        System.out.println(a);
         for(String a:y)
        System.out.println(a);
    }
}
public class Solution
{
    public static void main(String args[])
    {
        Integer []x={1,2,3};
        String []y={"Hello","World"};
        Printer.printArray(x,y);
    }
}
