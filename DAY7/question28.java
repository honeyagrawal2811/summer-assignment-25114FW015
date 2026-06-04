// package DAY7;
import java.util.Scanner;
public class question28 {
    static int rev = 0;
    static int reverseNumber(int n) {
        if (n == 0) {
            return rev;
        }
        rev = rev * 10 + (n % 10);
        return reverseNumber(n / 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        System.out.println("Reversed Number = "+ reverseNumber(n));
        sc.close();
    }
}