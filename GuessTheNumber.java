import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner myKeyboard = new Scanner(System.in);
        //auto generated random number
        double randomNumber = (Math.random()*10+1);
        int randomNum = (int) randomNumber;
        //asking if they want to play with one guess or guess until they get it correct
        System.out.println("Would you like to have an infinite number of guesses, or one guess? Type 1 for One, Type 2 for Infinite");
        //number of tries if they guess until correct
        int attempts = 0;
        //boolean for if they play with one guess or inifinite guesses
        boolean guesses;
        //condition for while loop, is false looping until correct, then becomes true, if user selects infinite guesses
        boolean guessed = false;
        switch(myKeyboard.nextInt()){
            case 1:
                guesses = true;
                break;
            default:
                guesses = false;
                break;
        }
        System.out.println("Enter a number from 1 to 10");
        int guess = myKeyboard.nextInt();
        // If the user chose one guess
        if(guesses){
            if(guess == randomNum){
                System.out.println("Correct! Great Job!");
            }
            else{
                System.out.println("The correct number was " + randomNum);
            }
        }
        // If the user chose infinite guesses
        else{
            while(guessed != true){
                attempts++;
                if(guess == randomNum){
                    System.out.println("Correct! Great Job! You took " + attempts + " attempt(s)");
                    guessed = true;
                }
                else{
                    System.out.println("Enter another number");
                    guess = myKeyboard.nextInt();
                }
            }
        }
   }
}