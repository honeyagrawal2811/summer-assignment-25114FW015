// A
// BB
// CCC
// DDDD
// EEEEE
package DAY9;
import java.util.Scanner;
public class question35 {
    public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            for(char ch='A';ch<='E';ch++) {
                for(int j=1;j<=(ch-'A'+1);j++){
                    System.out.print(ch);
                }
                System.out.println();
            }
            sc.close();
    }
}

