package DAY4;
import java.util.Scanner;
public class question16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your range's start: ");
        int start = sc.nextInt();

        System.out.print("Enter your range's end: ");
        int end = sc.nextInt();

        System.out.println("The Armstrong Numbers are : ");

        for (int i = start; i <= end; i++) {
            int temp = i;
            int digits = String.valueOf(i).length();
            int sum = 0;

            while (temp > 0) {
                int digit = temp % 10;
                sum += (int) Math.pow(digit, digits);
                temp /= 10;
            }

            if (sum == i)
                System.out.print(i + " ");
        }
        sc.close();
    }
}