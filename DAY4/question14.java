package DAY4;
import java.util.Scanner;
public class question14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number of term : ");
        int term = sc.nextInt();
        int firstterm = 0;
        int secondterm = 1;

        if(term == 1){
            System.out.println("Nth fibonacci term : "+ firstterm);
        }else if(term == 2){
            System.out.println("Nth fibonacci term : "+ secondterm);
        }else{
            for(int i = 3; i <= term; i++){
                int nextterm = firstterm + secondterm;
                firstterm = secondterm;
                secondterm = nextterm;
            }
           System.out.println("Nth fibonacci term : "+ secondterm);
        }
        sc.close();
    }
}