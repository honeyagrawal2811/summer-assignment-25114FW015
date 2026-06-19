package DAY19;
import java.util.Scanner;
public class question76 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of rows and columns: ");
        int n=sc.nextInt();
        int mat[][]=new int [n][n];
        System.out.print("Enter elements of matrix: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        int x=0;
        for(int i=0;i<n;i++){
                    x=x+mat[i][i];
                
        }
         System.out.print(x);
          
sc.close();
    }
    
}
