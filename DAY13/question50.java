// Write a program to Find sum and average of array.

package DAY13;
import java.util.Scanner;
public class question50 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("The size of array is: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++) {
            sum=sum+arr[i];
        }
        System.out.println("The sum of array elements is: " + sum);
        int average=0;
        for(int i=0;i<n;i++){
            average=(sum)/n;
        }
        System.out.print("The average of array elements is: " + average);
        
        sc.close();
    }
    
}
