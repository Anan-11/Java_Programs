import java.util.Scanner;

class MyException extends RuntimeException
{
    MyException(String s)
    {
        super(s);
    }
}

class Test11
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try
        {
            int a=sc.nextInt();
            if(a<18 || a>=60)
            {
                throw new MyException("invalid age is input");
            }
            System.out.println("age =" + " " + a);
        }
        catch(MyException obj)
        {
            System.out.println(obj.getMessage());
        }
        catch(Exception obj)
        {
            System.out.println(obj);
        }
    }
}
