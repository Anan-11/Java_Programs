// program represents the behaviour of .equals() method with non primitive datatypes(here arrays).
//.equals method is used for content comparison between the two arrays.

import java.util.Arrays;
class Test {
    public static void main(String[] args) {
        int []arr1 = {1,2,3};
        int[] arr2= {1,2,3};
        if(arr1 == arr2)
            System.out.println("SAME");
        else
            System.out.println("NOT SAME");
        if(Arrays.equals(arr1,arr2))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }

    }

}
