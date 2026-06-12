//Write a program to Frequency of an element.
package DAY14;
import java.util.Scanner;
public class question54 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("  The size of array is: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter element to find frequency: ");
        int x = sc.nextInt();
        int count =0;
        for(int i=0;i<n;i++){
            if (arr[i]==x){
                count++;
            }
        }
        System.out.println("The frequency of the searched element is: "+ count);
         sc.close();
    }
    
}
