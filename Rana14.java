import java.util.Scanner;
 
public class rana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            if (c % 2 == 1) { // Odd number of rounds
                if (b > a) {
                    System.out.println("Second");
                } else {
                    System.out.println("First");
                }
            } else { // Even number of rounds
                if (a > b) {
                    System.out.println("First");
                } else {
                    System.out.println("Second");
                }
            }
        }
    }
}