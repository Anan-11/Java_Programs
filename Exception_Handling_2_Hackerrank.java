import java.util.Scanner;
class MyCalculator {
    public long power(int n, int p)throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        }
        if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        }
        long res = 1;
        for (int i = 1; i <= p; i++) {
            res = res * n;
        }
        return res;
    }
    /*
    * Create the method long power(int, int) here.
    */
    
}
