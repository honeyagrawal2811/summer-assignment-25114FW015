// Write a program to Write function to find maximum.
package DAY11;
import java.util.Scanner;
public class question42 {
    public static int findmax(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("The two no.s are: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The greater no. is "+ findmax(a,b));
        sc.close();
    }
    
    
}
