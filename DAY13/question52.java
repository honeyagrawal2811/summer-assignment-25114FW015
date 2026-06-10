// Write a program to Count even and odd elements.
package DAY13;
import java.util.Scanner;
public class question52 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        System.out.print("Size of an array is:");
        int n=sc.nextInt();
        int arr[]=new int [n];
        System.out.print("Array is:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int even=0;
        int odd=0;
        for(int i=0;i<n;i++) {
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
            System.out.println("Even elements in an array are: " + even);
            System.out.println("Odd elements in an array are: "+odd);
        sc.close();
    }
    
}
