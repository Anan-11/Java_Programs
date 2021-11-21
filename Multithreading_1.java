import java.util.Random;
class Thread2 implements Runnable{
    public void run()
    {
        String []colors={"white","blue","black","green","red","yellow"};
        Random random=new Random(5);
        int flag=0;
        while(flag!=1) {
            int i1 = random.nextInt();
            if (i1 >= 0 && i1 <= 5) {
                if (!colors[i1].equals("red")) {
                    System.out.println(colors[i1]);
                } else {
                    flag++;
                }
            }
        }
    }
}

class Tmain1{
    public static void main(String[] args) {
        Thread obj=new Thread(new Thread2());
        obj.start();
    }
}
