package DAY3;
import java.util.Scanner;
public class question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter first number : ");
        int n1 = sc.nextInt();
        System.err.print("Enter second number : ");
        int n2 = sc.nextInt();
        int max;
        if(n1 > n2)
            max = n1;
        else
            max = n2;
        while(true){
            if(max % n1 == 0 && max % n2 == 0){
                System.out.println("LCD = "+max);
                break;
            }
            max++;
        }
        sc.close();
    }   
}