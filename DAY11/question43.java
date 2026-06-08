// Write a program to Write function to check prime
package DAY11;
import java.util.Scanner;
public class question43 {
    public static String checkPrime(int n){
        // int n=sc.nextInt();
        if (n <= 1) {
            return "not prime";
        }
        for(int i=2;i<=n/2;i++) {
            if(n%i==0) {
                return "notprime";
            }
           
            }
             return "prime";
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Give no. is "+ checkPrime(n));
        sc.close();
    }
}
      