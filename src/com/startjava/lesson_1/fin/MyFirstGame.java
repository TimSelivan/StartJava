package com.startjava.lesson_1.fin;

public class MyFirstGame {
    public static void main(String[] args) {
        int compNum = 32;
        int playerNum = 80;

        //мой вариант
        // do {
        //     if(compNum > playerNum) {
        //         System.out.println(playerNum + " меньше того, что загадал компьютер");
        //     } else if(compNum < playerNum) {
        //         System.out.println(playerNum + " больше того, что загадал компьютер");
        //     }
        //     playerNum++;
        //     if(playerNum > 100) {
        //         playerNum = 1;
        //     }
        // } while(compNum != playerNum);
        // if(compNum == playerNum) {
        //     System.out.println("Вы победили!");
        // }
        //вариант курса:
            while(compNum != playerNum) {
                if(compNum > playerNum) {
                    System.out.println(playerNum + " меньше того, что загадал компьютер");
                    playerNum++;
                } else if(compNum < playerNum) {
                    System.out.println(playerNum + " больше того, что загадал компьютер");
                    playerNum--;
                }
            }
        System.out.println("Вы победили!");
    }
}
