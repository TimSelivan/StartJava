package com.startjava.lesson_2_3_4.guess;
import java.util.Scanner;
import java.util.Arrays;

public class GuessNumber {
    private Player playerOne;
    private Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }
    Scanner scan = new Scanner(System.in);

    public void gameProcess() {
        System.out.println("Компьютер загадывает число от 1 до 100");
        int num = (int)(Math.random() * 100 + 1);
        int playerOneCounter = 0;
        int playerTwoCounter = 0;
        while(playerOneCounter < 10 || playerTwoCounter < 10) {
            System.out.println(playerOne.getName() + " угадывает число");
            int playerOneNum = scan.nextInt();
            playerOne.setPlayersNumbers(playerOneNum, playerOneCounter);
            if(num == playerOneNum) {
                System.out.println(playerOne.getName() + " угадал число с " + (playerOneCounter + 1) + " попытки!");
                arraysPrint(playerOne.getPlayersNumbers());
                Arrays.fill(playerOne.getPlayersNumbers(), 0);
                break;
            } else if(num > playerOneNum) {
                System.out.println("Загаданное компьютером число больше");
            } else if(num < playerOneNum) {
                System.out.println("Загаданное компьютером число меньше");
            }
            if(playerOneCounter == 9) {
                System.out.println("У игрока " + playerOne.getName() + " закончились попытки");
            }
            playerOneCounter++;
            System.out.println(playerTwo.getName() + " угадывает число");
            int playerTwoNum = scan.nextInt();
            playerTwo.setPlayersNumbers(playerTwoNum, playerTwoCounter);
            if(num == playerTwoNum) {
                System.out.println(playerTwo.getName() + " угадал число с " + (playerTwoCounter + 1) + " попытки!");
                arraysPrint(playerTwo.getPlayersNumbers());
                Arrays.fill(playerTwo.getPlayersNumbers(), 0);
                break;
            } else if(num > playerTwoNum) {
                System.out.println("Загаданное компьютером число больше");
            } else if(num < playerTwoNum) {
                System.out.println("Загаданное компьютером число меньше");
            }
            if(playerTwoCounter == 9) {
                System.out.println("У игрока " + playerTwo.getName() + " закончились попытки \n Ни один из игроков не угадал число, загаданное компьютером :,(");
                arraysPrint(playerOne.getPlayersNumbers());
                arraysPrint(playerTwo.getPlayersNumbers());
                Arrays.fill(playerOne.getPlayersNumbers(), 0);
                Arrays.fill(playerTwo.getPlayersNumbers(), 0);
            }
            playerTwoCounter++;
        }
    }
    public void arraysPrint(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }
}
