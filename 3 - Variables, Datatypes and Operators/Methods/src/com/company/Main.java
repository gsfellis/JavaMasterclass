package com.company;

public class Main {

    public static void main(String[] args) {
        String playerName = "Bob";
        int playerScore = 500;

        int position = calculateHighScorePosition(playerScore);

        displayHighScorePosition(playerName, position);
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table!");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int position = 4;

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }

        return position;
    }
}
