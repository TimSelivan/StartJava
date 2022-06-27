package com.startjava.lesson_2_3_4.guess;

public class Player {
    private String name;
    private int[] playerNumbers = new int[10];

    public Player(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int[] getPlayersNumbers() {
        return playerNumbers;
    }
    public void setPlayersNumbers(int value, int index) {
        this.playerNumbers[index] = value;
    }
}