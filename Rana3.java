import java.util.*;
 
public class Rana3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        sc.nextLine();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
 
            int ans = 0;
 
            for (int i = 1; i < n - 1; i++) {
                if (s.charAt(i - 1) == '.' && s.charAt(i) == '.' && s.charAt(i + 1) == '.') {
                    ans = 2;
                    break;
                }
            }
 
            if (ans == 0) {
                for (int i = 0; i < n; i++) {
                    if (s.charAt(i) == '.') {
                        ans++;
                    }
                }
            }
 
            System.out.println(ans);
        }
 
        sc.close();
    }
}