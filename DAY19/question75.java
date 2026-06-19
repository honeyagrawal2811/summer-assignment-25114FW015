package DAY19;
import java.util.Scanner;
public class question75 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of rows of a matrix: ");
        int r=sc.nextInt();
        System.out.print("Enter no. of columns of a matrix: ");
        int c=sc.nextInt();
        int mat[][]=new int [r][c];
        System.out.println("Enter elements of a matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("Transpose Matrix is:");
        for(int j=0;j<c;j++){
            for(int i=0;i<r;i++){
                System.out.print(mat[i][j ]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
