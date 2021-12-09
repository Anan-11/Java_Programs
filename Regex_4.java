import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases=in.nextInt();
        in.nextLine();
		while(testCases>0){
			String pattern = in.nextLine();
            try{
                Pattern p=Pattern.compile(pattern);
                System.out.println("Valid");
            }
            catch(Exception E)
            {
                System.out.println("Invalid");
            }
            testCases-=1; 	
		}
	}
}
