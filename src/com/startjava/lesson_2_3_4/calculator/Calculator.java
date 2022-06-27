package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    //проверка математического знака
    //сами вычисления
    private static int num1;
    private static int num2;
    private static char sign;
    private static int result = 0;

    public int getNum1() {
        return num1;
    }
    public static void setNum1(int num1) {
        Calculator.num1 = num1;
    }
    public int getNum2() {
        return num2;
    }
    public static void setNum2(int num2) {
        Calculator.num2 = num2;
    }
    public char getSign() {
        return sign;
    }
    public static void setSign(char sign) {
        Calculator.sign = sign;
    }
    public static float getResult() {
        return result;
    }

    public static int calculation() {
        switch(sign) {
            case '+' -> {
                result = Math.addExact(num1, num2);
            }
            case '-' -> {
            result = Math.subtractExact(num1, num2);
            }
            case '/' -> {
                result = (num1 / num2);
            }
            case '*' -> {
                result = Math.multiplyExact(num1, num2);
            }
            case '^' -> {
                result = (int) Math.pow(num1, num2);
            }
            case '%' -> {
                result = Math.floorMod(num1, num2);
            }
        }
        return result;
    }
}