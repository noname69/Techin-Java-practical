package org.example;

public class Player {
    private final String name;
    private int score;
    private int misses;
    private boolean isWinner;

    public Player(String name) {
        this.name = name;
        this.score = 0;
        this.misses = 0;
        this.isWinner = false;
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore( int points ) {
        this.score += points;
    }

    public int getMisses() {
        return this.misses;
    }

    public void setMisses() {
        this.misses++;
    }

    public void reset() {
        this.misses = 0;
        this.isWinner = false;
    }

    public void setIsWinner() {
        this.isWinner = true;
    }

    public void display() {
        System.out.println("Now playing: " + this.name);
    }


}
