package DAY3;
import java.util.Scanner;
public class question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter number 2 : ");
        int n2 = sc.nextInt();
        int gcd = 1;
        for(int i = 1; i <= n1 && i <= n2; i++){
            if(n1 % i == 0 && n2 % i ==0){
                gcd = i;
            }
        }

        System.out.println("The gcd of given two numbers is : "+ gcd);
        sc.close();
    }
}