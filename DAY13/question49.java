//Write a program to Input and display array
package DAY13;
import java.util.Scanner;
public class question49 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("The size of array is: ");
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      System.out.println("Array is:");
      for(int i=0;i<n;i++) {
        System.out.print( arr[i] +" ");
      }
      sc.close();
       
    }
}
