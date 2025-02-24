
import java.util.*;
 
public class Rana2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int arr[] = new int[n];
 
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
 
            int maxdiff = arr[0] - 0; 
 
            for (int i = 0; i < n - 1; i++) {
                maxdiff = Math.max(maxdiff, arr[i + 1] - arr[i]);
            }
 
            maxdiff = Math.max(maxdiff, 2 * (x - arr[n - 1]));
            
            System.out.println(maxdiff);
        }
    }
}