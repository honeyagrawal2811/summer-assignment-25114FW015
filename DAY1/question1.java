package DAY1;
import java.util.Scanner;
public class QUES1 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("The sum of first " + num + " natural numbers is: " + sum);
        sc.close();
    }

}