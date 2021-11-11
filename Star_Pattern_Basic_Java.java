


import java.util.Scanner;

class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 2 * n - 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= c; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            c = c - 2;
            for (int k = 1; k <= i - 1; k++) {
                System.out.print(" *");
            }
            // 1st half
            for (int k = 1; k <= i - 1; k++) {
                System.out.print(" *");
            }
            System.out.println();

        }
        c = 2 * n - 2;
        for (int i = n; i >= 1; i--) {
            if (i != n) {
                c=c+2;
                for (int j = 2 * n - 2; j < c; j++) {
                    System.out.print(" ");
                }

                System.out.print("*");

                for (int k = i - 1; k >= 1; k--) {
                    System.out.print(" *");
                }
                // 1st half
                for (int k = i - 1; k >= 1; k--) {
                    System.out.print(" *");
                }
                System.out.println();

            }
        }
    }
}
