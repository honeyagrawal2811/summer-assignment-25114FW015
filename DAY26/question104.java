package DAY26;
import java.util.Scanner;
public class question104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        int answer;

        // Question 1
        System.out.println("1. What is the capital of Uttar Pradesh?");
        System.out.println("1. Mumbai");
        System.out.println("2. Lucknow");
        System.out.println("3. Kolkata");
        System.out.println("4. Delhi");
        System.out.print("Enter your answer: ");
        answer = sc.nextInt();
        if (answer == 2)
            score++;
        // Question 2
        System.out.println("\n2. Which package contains the Scanner class?");
        System.out.println("1. java.io");
        System.out.println("2. java.lang");
        System.out.println("3. java.util");
        System.out.println("4. java.net");
        System.out.print("Enter your answer: ");
        answer = sc.nextInt();
        if (answer == 3)
            score++;

        // Question 3
        System.out.println("\n3. 15%4= ?");
        System.out.println("1. 3");
        System.out.println("2. 2");
        System.out.println("3. 8");
        System.out.println("4. 9");
        System.out.print("Enter your answer: ");
        answer = sc.nextInt();
        if (answer == 1)
            score++;

        // Question 4
        System.out.println("\n4. Which planet is known as the Red Planet?");
        System.out.println("1. Earth");
        System.out.println("2. Mars");
        System.out.println("3. Jupiter");
        System.out.println("4. Venus");
        System.out.print("Enter your answer: ");
        answer = sc.nextInt();
        if (answer == 2)
            score++;

        // Question 5
        System.out.println("\n5. Which keyword is used to create an object in Java?");
        System.out.println("1. class");
        System.out.println("2. this");
        System.out.println("3. new");
        System.out.println("4. static");
        System.out.print("Enter your answer: ");
        answer = sc.nextInt();
        if (answer == 3)
            score++;

        // Result
        System.out.println("\nQUIZ RESULT");
        System.out.println("Your Score: " + score + "/5");
        if (score == 5)
            System.out.println("Excellent!");
        else if (score >= 3)
            System.out.println("Good Job!");
        else
            System.out.println("Need More Practice!");

        sc.close();
    }
}