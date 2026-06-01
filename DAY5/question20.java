package DAY5;
import java.util.Scanner;
public class question20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        int largestPrimeFactor = -1;
        for(int i = 2; i <= n; i++) {
            while(n % i == 0) {
                largestPrimeFactor = i;
                n /= i;
            }
        }
        System.out.println("Largest Prime Factor = " + largestPrimeFactor);
        sc.close();
    }
}