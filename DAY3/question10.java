package DAY3;
import java.util.Scanner;
public class question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you range from 1 to ");
        int n = sc.nextInt();
        
        for(int i = 2; i <= n; i++){
            int prime = 0;
            for(int j = 2; j <= i/2; j++){
                if (i % j == 0) {
                    prime = 1;
                    break;
                }
            }
            if (prime ==0) {
                System.out.println(i);
            }  
        }

        sc.close();
    }
}