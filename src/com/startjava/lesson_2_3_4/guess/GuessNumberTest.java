package com.startjava.lesson_2_3_4.guess;
import java.util.Scanner;
//default Math.random() => [0;100)
//(0;100] => Math.random[1;101) => (Math.random() * (101 - 1)) + 1
public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Игра началась!");
        System.out.println("Введите имя первого игрока:");
        Player playerOne = new Player(scan.nextLine());
        System.out.println("Введите имя второго игрока");
        Player playerTwo = new Player(scan.nextLine());
        GuessNumber game = new GuessNumber(playerOne, playerTwo);

        String answer = "yes";
        //начало цикла
        do {
            if(answer.equals("yes")) {
            game.gameProcess();
            }
            System.out.println("Хотите продолжить игру? [yes/no]:");
            answer = scan.nextLine();
            if(!answer.equals("yes") && !answer.equals("no")) {
                System.out.println("Введите корректный ответ");
            }
        } while(!answer.equals("no"));
    }
}