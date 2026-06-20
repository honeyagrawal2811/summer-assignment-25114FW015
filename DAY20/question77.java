package DAY20;
import java.util.Scanner;
public class question77 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows and columns of first matrix: ");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
         System.out.print("Enter rows and columns of second matrix: ");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int mat1[][]=new int[r1][c1];
        int mat2[][]=new int[r2][c2];
        int mat3[][]=new int [r1][c2];
        if(c1!=r2){
            System.out.print("Matrix Multiplication is not possible.");
            return;
        }
        System.out.println("Enter elments of first matrix:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                mat1[i][j]=sc.nextInt();
            }
        }
         System.out.println("Enter elments of second matrix:");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                mat2[i][j]=sc.nextInt();
            }
        }
       
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    for(int k=0;k<c1;k++){
                        mat3[i][j]+=mat1[i][k]*mat2[k][j];
                    }
                }
            }
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    System.out.print(mat3[i][j] +" ");
                }
            }
        

        sc.close();
    }
    
}


// 1 2 3 4
// ith index=0;
// jth index =1;

// j=i+1
// 1+2=3!=5
// 1+3=4!=5 
// A.sort
