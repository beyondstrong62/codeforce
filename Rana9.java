import java.util.Scanner;
public class Rana9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long[] a = new long[(int)n];
            for (long i = 0; i < n - 1; i++) {
                a[(int)i] = sc.nextLong();
            }
            long sum = 0;
            for (long i = 0; i < n - 1; i++) {
                sum += a[(int)i];
            }
            System.out.println(-1 * sum);
        }
    }
}