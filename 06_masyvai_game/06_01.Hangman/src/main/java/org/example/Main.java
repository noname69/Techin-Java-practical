package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Hangman game = new Hangman("example");

        while(!game.winner()) {
            game.display();
            String input = scan.nextLine();
            char letter = input.charAt(0);
            if (game.guessLetter(letter)) {
                System.out.println("Good guess!");
            } else {
                System.out.println("Wrong guess!");
            }
        }

        System.out.println("Misees: " + game.misses);
    }
}