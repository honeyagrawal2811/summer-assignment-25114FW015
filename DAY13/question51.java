//Write a program to Find largest and smallest element.

package DAY13;
import java.util.Scanner;
public class question51 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("The size of array is: ");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Array is:");
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int largest=arr[0];
        int smallest=arr[0];
        for(int i=0;i<n;i++) {
            if(arr[i]>largest) {
                largest=arr[i];
            }

        }
        for(int i=0;i<n;i++) {
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("The largest element of an array is: " + largest);
        System.out.print("The smallest element of an array is: " + smallest);
        sc.close();
    }
    
}
