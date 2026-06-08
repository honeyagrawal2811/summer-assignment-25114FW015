// Write a program to Write function to find sum of two numbers.
package DAY11;
import java.util.Scanner;
public class question41 {
    public static int calcSum(int a,int b) {
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("The two numbers are: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The sum of given two numbers is " + calcSum(a,b));
        sc.close();
    }
    
}
