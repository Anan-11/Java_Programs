class Tthread1 extends Thread
    {
        public void run()
        {
            for(int i=0;i<2;i++)
            {
                System.out.println(" THREAD 1 "+i);
            }
        }
    }

    class Tthread2 extends Thread
    {
        public void run()
        {
            for(int i=0;i<2;i++)
            {
                System.out.println(" THREAD 2 "+i);
            }
        }
    }
    class Tthread3 extends Thread
    {
        public void run()
        {

                for(int i=0;i<2;i++)
                {
                    System.out.println(" THREAD 3 "+i);
                }

        }
        public void walk() {
            System.out.println(" i love java");
        }

    }

class Main1
{
    public static void main(String[] args) {
        Tthread1 obj1=new Tthread1();
        Tthread2 obj2=new Tthread2();
        Tthread3 obj3=new Tthread3();
        obj1.setPriority(1);
        obj2.setPriority(5);
        obj3.setPriority(10);
        obj1.start();
        obj2.start();
        obj3.start();


    }
}
