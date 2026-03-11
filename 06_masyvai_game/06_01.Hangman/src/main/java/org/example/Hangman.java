package org.example;

public class Hangman {
    private final String wordToGuess;
    private String guessedWord;
    public int misses;

    public Hangman(String wordToGuess) {
        this.wordToGuess = wordToGuess.trim().toLowerCase();
        this.guessedWord = "*".repeat(wordToGuess.length());
    }

    public void display() {
        System.out.print("Enter a letter in word " + this.guessedWord + " ");
    }

    public boolean guessLetter(char letter) {
        letter = Character.toLowerCase(letter);
        boolean found = false;

        int index = this.wordToGuess.indexOf(letter);
        if(index >= 0 && this.guessedWord.charAt(index) == letter) {
            System.out.println(letter + " is already in the world");
        }

        if(index >= 0) {
            found = true;
        }

        while (index >= 0) {
            this.guessedWord = this.guessedWord.substring(0,index)+letter+this.guessedWord.substring(index+1);
//            System.out.println(index);
            index = wordToGuess.indexOf(letter, index + 1);
        }

        if(!found) {
            this.misses++;
        }

        return found;
    }

    public boolean winner() {
        return guessedWord.equals(wordToGuess);

    }

//    public boolean looser() {}



}
