package com.startjava.lesson_2_3_4.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf alfa = new Wolf();
        alfa.setSex("male");
        alfa.setName("Jora");
        alfa.setAge(5);

        System.out.println(alfa.getSex());
        System.out.println(alfa.getName());
        System.out.println(alfa.getAge());
        alfa.wolfWalking();
        alfa.wolfSitting();
        alfa.wolfRunning();
        alfa.wolfHowling();
        alfa.wolfHunting();
    }
}