package com.startjava.lesson_2_3_4.calculator;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        //создание объектов
        //инициализация объектов
        //ввод математического выражения
        //запуск вычислений
        //обработка ответа пользователя о продолжении/завершении
    Scanner scan = new Scanner(System.in);

    boolean a = true;
        while(a) {
            System.out.print("Калькулятор запущен \n Введите математическое выражение через пробел:");
            String str = scan.nextLine();
            String[] arguments = str.split(" ");
            Calculator.setNum1(Integer.parseInt(arguments[0]));
            Calculator.setSign(arguments[1].charAt(0));
            Calculator.setNum2(Integer.parseInt(arguments[2]));
            Calculator.calculation(); //запуск вычислений
            System.out.println(Calculator.getResult());
            while(true) {
                System.out.println("Хотите продолжить вычисления? [yes/no]");
                String response = scan.nextLine();
                if(response.equals("yes")) {
                    break;
                } else if(response.equals("no")) {
                    a = false;
                    break;
                } else {
                    System.out.println("Введите корректный ответ");
                }
            }
        }
    }
}