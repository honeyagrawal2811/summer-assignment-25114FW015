// Write a program to Write function to find factorial.
package DAY11;
import java.util.Scanner;
public class question44{
    public static int calcfact(int n) {
        int fact=1;
        for(int i=1;i<=n;i++) {
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Given number is ");
        int n=sc.nextInt();
        System.out.println("The factorial of given number is " + calcfact(n));
        sc.close();
    }
}