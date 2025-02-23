import java.util.*;
 
public class Rana1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 
 
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            long[] a = new long[n];
 
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextLong();
            }
 
            long[] sortedA = a.clone();
            Arrays.sort(sortedA);
 
            if (Arrays.equals(a, sortedA) || k > 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}