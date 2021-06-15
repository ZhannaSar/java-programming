package day24_loops;

import java.util.*;

public class GuessTheNumberName {
    public static void main(String[] args) {
            Random randomNum = new Random();
            //System.out.println(random.nextInt(101));
        Scanner scan = new Scanner(System.in);
        int secretNumber = randomNum.nextInt(101);
        int guessingNumber;
        do {
            System.out.println("Guess the secret number");
            guessingNumber = scan.nextInt();
            if (guessingNumber > secretNumber) {
                System.out.println("Wrong! your number is too large!");
            } else if (guessingNumber < secretNumber) {
                System.out.println("Wrong! your number is too small!");
            }
        } while ( secretNumber != guessingNumber);

        System.out.println("Congratulations! You won! secret number = " + secretNumber);

    }
}