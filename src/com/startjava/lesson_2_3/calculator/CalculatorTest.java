package com.startjava.lesson_2_3.calculator;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        //создание объектов
        //инициализация объектов
        //ввод математического выражения
        //запуск вычислений
        //обработка ответа пользователя о продолжении/завершении
    Scanner scan = new Scanner(System.in);
    Calculator calc = new Calculator();

    boolean a = true;
        while(a) {
            System.out.println("Введите первое число");
            calc.setNum1(scan.nextInt());
            scan.nextLine();
            System.out.println("Введите знак математической операции");
            calc.setSign(scan.nextLine().charAt(0));
            System.out.println("Введите второе число");
            calc.setNum2(scan.nextInt());
            calc.calculation();
            System.out.println(calc.getResult());
            scan.nextLine();
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
                    continue;
                }
            }
        continue;
        }
    }
}