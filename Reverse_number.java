Sample input                      Sample output
4                                 54321
12345                             30213
31203                             3213
2123                              32
2300


import java.util.*;
class Reverse
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=1;i<=T;i++)  // no of test cases
		{
		    int n=sc.nextInt();
		    int n1=0;
		    int count=10;
		    while(n!=0)
		    {
		       int a=n%10;
		        n1=(n1*count)+a;
		        n=n/10;
		    }
		    System.out.println(n1);
		}
	
	}
}
