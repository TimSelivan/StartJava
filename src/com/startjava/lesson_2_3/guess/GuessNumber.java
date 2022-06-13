package com.startjava.lesson_2_3.guess;
import java.util.Scanner;

public class GuessNumber {
    private Player playerOne;
    private Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }
    Scanner scan = new Scanner(System.in);

    public void gameProcess() {
        System.out.println("Компьютер загадывает число");
        int num = (int)(Math.random() * 100 + 1);
            while(true) {
                System.out.println(playerOne.getName() + " угадывает число");
                int playerOneNum = scan.nextInt();
                if(num == playerOneNum) {
                    System.out.println(playerOne.getName() + " победил!");
                    break;
                } else if(num > playerOneNum) {
                    System.out.println("Загаданное компьютером число больше");
                } else if(num < playerOneNum) {
                    System.out.println("Загаданное компьютером число меньше");
                }
                System.out.println(playerTwo.getName() + " угадывает число");
                int playerTwoNum = scan.nextInt();
                if(num == playerTwoNum) {
                    System.out.println(playerTwo.getName() + " победил!");
                    break;
                } else if(num > playerTwoNum) {
                    System.out.println("Загаданное компьютером число больше");
                } else if(num < playerTwoNum) {
                    System.out.println("Загаданное компьютером число меньше");
                }
            }
    }
}
