import java.util.Scanner;

public class CustomException3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        System.out.println("marks in 3 subjects of s1 and s2");
        for(int i=1;i<=2;i++)
        {
            try
            {
                int m1=Integer.parseInt(sc.next());
                int m2=Integer.parseInt(sc.next());
                int m3=Integer.parseInt(sc.next());
                if(m1<0 | m2<0 | m3<0)
                {
                    throw new Exception("Negative Values");
                }
                if(m1>100 | m2>100 | m3>100)
                {
                    throw new Exception("out of range");
                }
            }
            catch(NumberFormatException obj)
            {
                System.out.println("NumberFormatException");
            }
            catch(Exception obj)
            {
                System.out.println(obj.getMessage());
            }
        }
    }

}
