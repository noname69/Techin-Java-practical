package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean playAgain = true;

        Scanner scan = new Scanner(System.in);

        Player playerOne = new Player("Paweł");
        Player playerTwo = new Player("Antonio");

        Player currentPlayer = playerOne;

        while(playAgain) {
            String[] words = {"java", "hangman", "computer", "network"};

            Hangman game = new Hangman(words[new Random().nextInt(words.length)], 7);

            while (!game.winner() && !game.loser()) {
                System.out.println("___________________________________");
                currentPlayer.display();
                game.display();


                String input = scan.nextLine().trim();
                System.out.println("___________________________________");

                // Check or input is only one letter
                if(input.length() != 1) {
                    System.out.println("Should be a letter");
                    continue;
                }

                char letter = input.charAt(0);

                // Check letter is really letter, no numbers or special symbols
                if(!Character.isLetter(letter)) {
                    System.out.println("Should be a letter");
                    continue;
                }

                // Guessing letter
                if (game.guessLetter(letter)) {
                    System.out.println("Good guess!");
                } else {
                    currentPlayer.setMisses();
                    System.out.println("Wrong guess!");
                }

                currentPlayer = (currentPlayer == playerOne) ? playerTwo : playerOne;
            }

            if(game.winner()) {
                Player winner = (currentPlayer == playerOne) ? playerTwo : playerOne;
                System.out.println("Winner is: " + winner.getName());
                winner.setScore(1);
                winner.setIsWinner();
            } else {
                System.out.println("Nobody wins");
            }

            System.out.println();
            System.out.println("___________________________________");
            System.out.println(playerOne.getName() + ": Points: " +
                    playerOne.getScore() + " Last game misses: " +
                    playerOne.getMisses());
            System.out.println(playerTwo.getName() + ": Points: " +
                    playerTwo.getScore() + " Last game misses: " +
                    playerTwo.getMisses());
            System.out.println("___________________________________");
            System.out.println();

            playerOne.reset();
            playerTwo.reset();

            System.out.println("Play again (y/n): ");
            String answer = scan.nextLine();

            playAgain = answer.equalsIgnoreCase("y");
        }
    }
}