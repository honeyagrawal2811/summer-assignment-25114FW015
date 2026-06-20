package DAY20;
import java.util.Scanner;
public class question80 {
    public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    System.out.print("Enter no. of rows in a matrix: ");
    int r=sc.nextInt();
    System.out.print("Enter no. of  columns in a matrix: ");
    int c=sc.nextInt();
    int mat[][]=new int [r][c];
    System.out.println("Enter elements of a matrix:");
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            mat[i][j]=sc.nextInt();
        }
    }
    for (int j = 0; j < c; j++) {
    int sum = 0;
    for (int i = 0; i < r; i++) {
        sum += mat[i][j];
    }
    System.out.println("Sum of column " + (j + 1) + " = " + sum);
}
    sc.close();
    }
}
