import java.util.TreeSet;

public class prog7 {
    public static void main(String[] args) {
        int ar1[]={10,20,10,70,90,30,40,70,20};
        int ar2[]={1,5,10,2,20,7,70,90};
        TreeSet <Integer> tree1 = new TreeSet<>();
        for(int i=0;i<ar1.length;i++)
        {
            for(int j=0;j<ar2.length;j++)
            {
                if(ar1[i]==ar2[j])
                {
                    Integer i1=ar1[i];
                    tree1.add(i1);
                }
            }
        }
        System.out.println(tree1);
    }
}
