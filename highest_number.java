// use of ArrayList(Collection framework) and Java Regex
import java.util.Scanner;
import java.util.regex.*;
import java.util.*;

public class max_numb {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();                      // taking the string as input
        ArrayList <Integer> obj=new ArrayList<>();
            Pattern p=Pattern.compile("[0-9]+");     // to match numbers from the given string
            Matcher m=p.matcher(s);
            while(m.find())
            {
                String s1=m.group();
                int x=Integer.parseInt(s1);
                obj.add(x);
            }
            Collections.sort(obj);                   // sorted ArrayList
        System.out.println(obj.get(obj.size()-1));

    }
}
