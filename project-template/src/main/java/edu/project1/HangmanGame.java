package edu.project1;

import java.util.Random;
import java.util.Scanner;

public class HangmanGame {

    public static int triesCount = 5;
    private static int wrongGuessCount = 0;

    public static String guesses = "";

    static Scanner in = new Scanner(System.in);

        public static void hangmanGame() {

            String[] words = new String[]{"Tinkoff", "Project", "Course", "HomeWork", "Java", "Study", "Progress"};

            guesses = "";
            wrongGuessCount = 0;

            System.out.println("Game started");

            Random obj = new Random();
            int Ran_num = obj.nextInt(7);

            // takes input of the word
            String word = (words[Ran_num]);
            word = word.toLowerCase();

            String word1 = word.replaceAll("[a-z]", "*");

            startGame(word, word1);
        }
        private static void startGame(String word, String word1) {


            char letter;

            boolean guessinWord;

            while (wrongGuessCount < triesCount && word1.contains("*")) {

                System.out.println("The word: " + word1 + "\n");

                letter = inputLetter();

                if(wrongGuessCount == -1){
                    System.out.println("The word was " + word + ". \nGame finished.");
                    return;
                }

                while (guessesContainsGuess(letter)) {

                    System.out.println("You ALREADY guessed "
                        + letter + ". Guess a letter again: \n");
                    letter = inputLetter();

                    if(wrongGuessCount == -1){
                        System.out.println("The word was " + word + ". \nGame over.");
                        return;
                    }
                }

                guesses += letter;

                guessinWord = (word.indexOf(letter)) != -1;

                if (guessinWord) {

                    System.out.println("Hit!");
                    System.out.print("\n");

                    for (int position = 0;
                         position < word.length(); position++) {

                        if (word.charAt(position) == letter
                            && word1.charAt(position) != letter) {

                            String word2;
                            word2 = word1.substring(0, position)
                                + letter
                                + word1.substring(position
                                + 1);

                            word1 = word2;
                        }
                    }
                } else {

                    wrongGuessCount++;
                    System.out.println("Missed, mistake " + wrongGuessCount + " out of 5.");
                }

            }

            if (wrongGuessCount == triesCount) {

                System.out.println("You lost!");

            } else {

                System.out.print("The word: " + word1 + "\n\nYou won!");
            }
        }

        private static char inputLetter(){

            System.out.print("Guess a letter: ");

            String guess = in.nextLine();
            guess = guess.toLowerCase();

            if(guess.equals("stop")){

                wrongGuessCount = -1;

            }

            return guess.charAt(0);

        }
        private static boolean guessesContainsGuess(char letter){

            return (guesses.indexOf(letter)) != -1;

        }
}
