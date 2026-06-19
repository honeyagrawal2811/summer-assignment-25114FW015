package DAY19;
import java.util.Scanner;
public class question74 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows of a matrix: ");
        int r=sc.nextInt();
        System.out.print("Enter columns of a matrix : ");
        int c=sc.nextInt();
        int A[][]=new int[r][c];
        int B[][]=new int[r][c];
        int C[][]=new int[r][c];
        System.out.println("Enter elements of first matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter elements of second matrix:");
          for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                B[i][j]=sc.nextInt();
            }
        }
          for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                C[i][j]=A[i][j]-B[i][j];
           }
        }
        System.out.println("Subtraction Matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
