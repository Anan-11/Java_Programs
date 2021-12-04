import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class NumberChecker
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Pattern p=Pattern.compile("(0|91)?[1-9][0-9]{9}");
        Matcher m=p.matcher(str);
        int count=0;
        while(m.find())
        {
            System.out.println(m.group());
            count++;
        }
        System.out.println(count);

    }
}
