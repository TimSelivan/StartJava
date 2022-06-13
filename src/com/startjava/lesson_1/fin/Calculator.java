package com.startjava.lesson_1.fin;

public class Calculator {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 5;
        char sign = '+';
        float result = 0f;
        char addition = '+';
        char subtraction = '-';
        char multiplication = '*';
        char division = '/';
        char exponantiation = '^';
        char modulo = '%';

        if(sign == addition) {
            result = num1 + num2;
            System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
        } else if(sign == subtraction) {
            result = num1 - num2;
            System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
        } else if(sign == multiplication) {
            result = num1 * num2;
            System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
        } else if(sign == division) {
            result = num1 / num2;
            System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
        } else if(sign == exponantiation) {
            result = 1;
            for(int i = num2; i > 0; i--) {
                result *= num1;
            }
            System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
        } else if(sign == modulo) {
            result = num1 % num2;
            System.out.println(num1 + " " + sign + " " + num2 +" = " + result);
        }
    }
}