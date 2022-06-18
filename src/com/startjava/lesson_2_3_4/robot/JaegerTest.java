package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger one = new Jaeger();
        one.setModelName("Horizon Brave");
        one.setMark("Mark 1");
        one.setArmor(6);
        one.setKaijuKilled(2);

        System.out.println(one.getModelName() + " " + one.getMark() + " " + one.getArmor() + " " + one.getKaijuKilled());

        Jaeger two = new Jaeger("Romeo Blue", "Mark 1", 6, 2);
        System.out.println(two.getModelName() + " " + two.getMark() + " " + two.getArmor() + " " + two.getKaijuKilled());
        System.out.print(one.getModelName() + " is ");
        one.move();
        System.out.print(two.getModelName() + " is ");
        two.move();
    }
}