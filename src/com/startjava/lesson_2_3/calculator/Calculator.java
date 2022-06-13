package com.startjava.lesson_2_3.calculator;

public class Calculator {
    //проверка математического знака
    //сами вычисления
    private int num1;
    private int num2;
    private char sign;
    private float result = 0f;

    public int getNum1() {
        return num1;
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public int getNum2() {
        return num2;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public char getSign() {
        return sign;
    }
    public void setSign(char sign) {
        this.sign = sign;
    }
    public float getResult() {
        return result;
    }

    public void calculation() {
        switch(sign) {
            case '+' :
                result = num1 + num2;
                break;
            case '-' :
                result = num1 - num2;
                break;
            case '*' :
                result = num1 * num2;
                break;
            case '/' :
                result = num1 / num2;
                break;
            case '^' :
                result = 1;
                for( int i = num2; i > 0; i--) {
                    result *= num1;
                }
                break;
            case '%' :
                result = num1 % num2;
                break;
        }
    }
}