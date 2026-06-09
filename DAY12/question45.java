//Write a program to Write function for palindrome.

import java.util.Scanner;
public class question45 {
    public static String checkpalindrome(int n){
        int digit;
        int rev=0;
        int original=n;
        while(n>0){
            digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        if(original==rev){
            return "palindrome";
        }
        else{
            return"not pallindrome.";
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("The number is " + checkpalindrome(n));
        sc.close();
    }
}
