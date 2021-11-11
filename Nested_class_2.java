// Concept of anonymous object using nested classes;

public class One {
    class Two
    {
        class Three
        {
            class Four
            {
                int a=30;
                public void display()
                {
                    System.out.println(a);
                }
            }
        }
    }
}
class OneMain
{
    public static void main(String[] args) {
       //anonymous object
        new One().new Two().new Three().new Four().display();
    }
}
