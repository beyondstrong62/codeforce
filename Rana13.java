import java.util.*;
 
public class Rana13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long[] arr = new long[(int) n];  // Use long array for larger values
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
 
            long max = arr[0];
            for (int i = 1; i < n; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
 
            ArrayList<Long> b = new ArrayList<>();
            ArrayList<Long> c = new ArrayList<>();
 
            for (int i = 0; i < n; i++) {
                if (arr[i] != max) {
                    b.add(arr[i]);
                } else {
                    c.add(arr[i]);
                }
            }
 
            if (b.size() == 0) {  // all elements are the same (all max)
                System.out.println(-1);
            } else {
                System.out.println(b.size() + " " + c.size());
                for (long num : b) {
                    System.out.print(num + " ");
                }
                System.out.println();
                for (long num : c) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
    }
}