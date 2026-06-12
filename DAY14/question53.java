// Write a program to Linear search
package DAY14;
import java.util.Scanner;
public class question53 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("The size of array is: ");
        int n=sc.nextInt();
        int arr[]=new int [n];
        System.out.println("Elements of array are: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Element to be searched: ");
        int x=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                System.out.println("Element is successfully found.");
                System.out.println("Element is found at " + (i+ 1) +" position");
                sc.close();
                return;
            }
        
        }
                System.out.println("Element does not exist.");
            
        


        sc.close();
    }
    
}


