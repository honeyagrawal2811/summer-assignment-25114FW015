// Write a program to Write function for perfect number.

import java.util.Scanner;
public class question48 {
    public static String checkperfect(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
            
        }
        if(sum==n){
        return "a Perfect number.";
        }
        else{
            return "Not a perfect number.";
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("The no. is " + checkperfect(n));
        sc.close();   
    }
}
