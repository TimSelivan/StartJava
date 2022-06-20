package com.startjava.lesson_2_3_4.calculator;

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

    public float calculation() {
        switch(sign) {
            case '+' :
                result = Math.addExact(num1, num2);
                break;
            case '-' :
                result = Math.subtractExact(num1, num2);
            case '/' :
                result = num1 / num2;
                break;
            case '*' :
                result = Math.multiplyExact(num1, num2);
                break;
            case '^' :
                result = (float) Math.pow(num1, num2);
                break;
            case '%' :
                result = Math.floorMod(num1, num2);
                break;
        }
        return result;
    }
}