import java.util.*;
public class Rana8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  
        
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            
            long[] a = new long[(int)n];  
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            
            boolean numberIsPresent = false;
            for (int i = 0; i < n; i++) {
                if (a[i] == k) {
                    numberIsPresent = true;
                    break;
                }
            }
            
            if (numberIsPresent) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}