//Write a program to Find duplicates in array.
package DAY14;
import java.util.Scanner;
public class question56 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int n=sc.nextInt();
        System.out.println("Enter array elements:"); 
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j =i+1;j<n;j++){
                if(arr[i]==arr[j]) {
                    System.out.println("Duplicate element is: " +arr[i]);
                    break;
                }
            }
        }
        sc.close();
    }
    
}
