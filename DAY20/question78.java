package DAY20;
import java.util.Scanner;
public class question78 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Ener rows and columns of a matrix: ");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int mat[][]=new int [r][c];
        if(r!=c){
            System.out.print("Given matrix is not symmetric matrix.");
            return;
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
        
        if(mat[i][j]!=mat[j][i]){
             System.out.print("Given matrix is not a symmetric matrix.");
        return;
        }
    }
}
             System.out.print("Given matrix is a symmetric matrix.");
 
     sc.close();
    } 
}
