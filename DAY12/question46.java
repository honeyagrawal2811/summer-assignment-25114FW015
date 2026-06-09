//Write a program to Write function for Armstrong.

import java.util.Scanner;
public class question46 {
    public static String checkarmstrong(int n){
        int sum=0;
        int digit;
        int original=n;
        while(n>0){
        digit=n%10;
        sum=sum+(digit*digit*digit);
        n=n/10;
        }
         
        if(original==sum){
            return "Armstrong";
        }
        else{
            return "not Armstrong.";
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("The no. is: ");
        int n=sc.nextInt();
        System.out.println("The no. is " + checkarmstrong(n));

        sc.close();
    }
}
