package csc223.sb;
import java.util.Random;
import java.util.Scanner;


public class WordGuess implements Game {

    String[] words = {"computer", "science", "softball", "programming", "football", "puzzle"};
    String chosen_word;
    char[] guessed_word;
    int attempts;
    int ATTEMPTS_ALLOWED= 7;
    Scanner scanner;
    
    @Override
    public void startGame(){

        // randomly select word
        Random random = new Random();
        this.chosen_word = words[random.nextInt(words.length)];

        // generate array and initialize with underscores for hidden word
        this.guessed_word = new char[chosen_word.length()];
        for (int i = 0; i < this.guessed_word.length; i++){
            this.guessed_word[i] = '_';
        }
        
        this.attempts = ATTEMPTS_ALLOWED;
        this.scanner = new Scanner(System.in);
        System.out.println("Welcome to the Word Guessing game!\n Let's begin!");

    }
    @Override
    public void printBoard(){
        //print the tracking string
        System.out.println(this.guessed_word);
        System.out.println("Attempts Left:" + this.attempts);
    }
    @Override
    public void takeTurn(){
        // player enters a letter 
        System.out.println("Enter a letter: ");
        char letter = this.scanner.next().toLowerCase().charAt(0);

        boolean letter_found = false;
        // search for letter in chosen word 
        for (int i = 0; i < this.chosen_word.length(); i++){
            if (this.chosen_word.charAt(i) == letter){
                // when found reveal letter in guessed word
                guessed_word[i] = letter;
                letter_found = true;
            }
        }

        // when guess is incorrect player loses an attempt
        if (!letter_found){
            this.attempts --;
            System.out.println("Incorrect");
        } else{
            System.out.println("Correct guess");
        }

    }
    @Override
    public boolean isGameOver(){
        //check if out of guesses or if word is guessed
        return (this.attempts == 0 || new String(this.guessed_word).equals(this.chosen_word));
    }
    @Override
    public void endGame(){

        //print a congradulations if word is guessed  
        if (new String(this.guessed_word).equals(this.chosen_word)){
            System.out.println("Congradulations! You win!");
        }else{
            //print the correct word if out of attempts
            System.out.println("You lose. The word was: " + this.chosen_word);
        }

    }
    @Override
    public void playGame(){
        // loop to run the game
        startGame();
        while(!isGameOver()){
            printBoard();
            takeTurn();
        }
        endGame();
    }
    public static void main(String[] args) {
        WordGuess game = new WordGuess();
        game.playGame();
    }
}
