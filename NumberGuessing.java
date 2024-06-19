import java.util.*;
public class NumberGuessing {
    public static void main(String []args){
        int randomNumber = (int)(Math.random()*100)+1;
        Scanner scanner=new Scanner(System.in);
        boolean guessedCorrectly = false;
        int numberOfAttempts=0;
        System.out.println("Guess any number between 1 to 100");
        while (!guessedCorrectly && numberOfAttempts < 5){
            int userGuess = scanner.nextInt();
            if(userGuess== randomNumber){
                guessedCorrectly=true;
            }
            else {
                numberOfAttempts++;
                if(userGuess > randomNumber){
                    System.out.println("Your guess is too high.");
                }
                else {
                    System.out.println("Your guess is too low.");
                }
            }

        }
        scanner.close();
        if(guessedCorrectly){
            System.out.println("Congratulation! You guessed correctly! The number was "+randomNumber);
        }else{
            System.out.println("Sorry, you ran out of guesses. The correct answer was "+ randomNumber);
        }
        System.out.println("\nSystem Generated number is "+randomNumber);
    }
}
