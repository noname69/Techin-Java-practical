package org.example;

public class Hangman {
    private final String wordToGuess;
    private String guessedWord;
    private int misses;
    private int guesses;

    public Hangman(String wordToGuess, int numberOfGuesses) {
        this.wordToGuess = wordToGuess.trim().toLowerCase();
        this.guessedWord = "*".repeat(wordToGuess.length());
        this.guesses = numberOfGuesses;
    }

    public void display() {
        System.out.println("Guesses left: " + this.guesses);
        System.out.println("Word: " + this.guessedWord);
        System.out.print("Enter a letter: ");
    }

    public boolean guessLetter(char letter) {
        letter = Character.toLowerCase(letter);
        boolean found = false;

        int index = this.wordToGuess.indexOf(letter);
        if (this.guessedWord.indexOf(letter) >= 0) {
            System.out.println(letter + " is already guessed.");
            return true;
        }

        if(index >= 0) {
            found = true;
        }

        while (index >= 0) {
            this.guessedWord = this.guessedWord.substring(0,index)+letter+this.guessedWord.substring(index+1);
            index = wordToGuess.indexOf(letter, index + 1);
        }

        if(!found) {
            this.misses++;
            this.guesses -= 1;
        }

        return found;
    }

    public boolean winner() {
        return guessedWord.equals(wordToGuess);
    }

    public boolean loser() {
        return this.guesses == 0;
    }

    public int getMisses() {
        return this.misses;
    }

    public void resetGame() {

    }





}
