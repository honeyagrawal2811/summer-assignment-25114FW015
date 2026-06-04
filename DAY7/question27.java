// package DAY7;
import java.util.Scanner;
public class question27 {
    static int sumdigits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumdigits(n / 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Sum of Digits = " + sumdigits(n));
        sc.close();
    }
}