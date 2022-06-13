package com.startjava.lesson_1.base;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        //Перевод псевдокода на язык Java
        System.out.println("\nПеревод псевдокода на язык Java");

        int age = 21;
        if(age > 20) {
            System.out.println("Пора съехать от родителей.");
        } else {
            System.out.println("Посиди еще на шее у родителей");
        }

        boolean isMale = false;
        if(!isMale) {
            System.out.println("Мужик");
        }

        float height = 1.81f;
        if(height < 1.80) {
            System.out.println("Коротышка");
        } else {
            System.out.println("Каланча");
        }

        //name Oleg;
        char firstNameLetter = 'O';
        if(firstNameLetter == 'M') {
            System.out.println("Имя начинается на букву М");
        } else if(firstNameLetter == 'I') {
            System.out.println("Имя начинается на букву I");
        } else {
            System.out.println("Имя начинается на любые буквы кроме M и I");
        }

        //Поиск максимального и минимального числа
        System.out.println("\nПоиск максимального и минимального числа");

        int x = 157;
        int y = 983;

        if(x > y) {
            System.out.println("Число " + x + " больше числа " + y);
        } else {
            System.out.println("Число " + y + " больше числа " + x);
        }

        //Работа с числом
        System.out.println("\nРабота с числом");

        int number = 345;

        if(number % 2 == 0) {
            System.out.println(number + " является четным");
        } else {
            System.out.println(number + " является нечетным");
        }

        if(number > 0) {
            System.out.println(number + " является положительным");
        } else {
            System.out.println(number + " является отрецательным");
        }

        //Поиск общей цифры в числах
        System.out.println("\nПоиск общей цифры в числах");

        int a = 523;
        int b = 827;

        int unitsA = a % 10;
        int unitsB = b % 10;
        int dozA = a / 10 % 10;
        int dozB = b / 10 % 10;
        int hunA = a / 100;
        int hunB = b / 100;

        if(unitsA == unitsB) {
            System.out.println("Значения первых разрядов чисел " + a + " и " + b + " равны " + unitsA);
        }
        if(dozA == dozB) {
            System.out.println("Значения вторых разрядов чисел " + a + " и " + b + " равны " + dozA);
        }
        if(hunA == hunB) {
            System.out.println("Значения третьих разрядов чисел " + a + " и " + b + " равны " + hunA);
        }

        //Определение буквы, числа или символа по их коду
        System.out.println("\nОпределение буквы, числа или символа по их коду");

        char c = '\u005A';

        if(c <= 90 && c >= 65) {
            System.out.println(c + " является заглавной буквой");
        } else if(c <= 122 && c >= 97) {
            System.out.println(c + " является строчной буквой");
        } else if(c <= 57 && c >= 48) {
            System.out.println(c + " является числом");
        } else {
            System.out.println(c + " не явялется числом или буквой");
        }

        //Определение суммы вклада и начисленных банком %
        System.out.println("\nОпределение суммы вклада и начисленных банком %");

        int deposit = 300000;
        float interest = 0f;

        if(deposit < 100000) {
            interest = 0.05f;
        } else if(deposit <= 300000) {
            interest = 0.07f;
        } else {
            interest = 0.1f;
        }

        System.out.println("Cумма вклада " + deposit + " Начисленный % " + deposit * interest + " Итоговая сумма " + deposit * (1 + interest));

        //Определение оценки по предметам
        System.out.println("\nОпределение оценки по предметам");

        float historyPercentage = 0.59f;
        float programmingPercentage = 0.91f;
        float historyMark = 0f;
        float programmingMark = 0f;

        if(historyPercentage <= 0.6) {
            System.out.println("История - " + (historyMark = 2));
        } else if(historyPercentage > 0.91) {
            System.out.println("История - " + (historyMark = 5));
        } else if(historyPercentage > 0.73) {
            System.out.println("История - " + (historyMark = 4));
        } else if(historyPercentage > 0.60) {
            System.out.println("История - " + (historyMark = 3));
        }

        if(programmingPercentage <= 0.6) {
            System.out.println("Программирование - " + (programmingMark = 2));
        } else if(programmingPercentage > 0.91) {
            System.out.println("Программирование - " + (programmingMark = 5));
        } else if(programmingPercentage > 0.73) {
            System.out.println("Программирование - " + (programmingMark = 4));
        } else if(programmingPercentage > 0.6) {
            System.out.println("Программирование - " + (programmingMark = 3));
        }

        System.out.println("Средний балл оценок по предметам " + (programmingMark + historyMark) / 2);
        System.out.println("Средний % по предметам " + (historyPercentage + programmingPercentage) / 2 * 100);

        //Расчет прибыли (убытка)
        System.out.println("\nРасчет прибыли (убытка)");

        int rent = 5000;
        int revenue = 15000;
        int goodsCost = 9000;
        int profit = (revenue - goodsCost - rent) * 12;

        System.out.println(profit);

        if(profit > 0) {
            System.out.println("+ " + profit);
        } else {
            System.out.println("" + profit);
        }

        //Определение существования треугольника
        System.out.println("\nОпределение существования треугольника");

        int hypotenuse = 5;
        int leg1 = 4;
        int leg2 = 3;

        if(leg2 * leg2 + leg1 * leg1 == hypotenuse * hypotenuse) {
        } else if(hypotenuse * hypotenuse + leg1 * leg1 == leg2 * leg2) {
            hypotenuse = 3;
            leg2 = 5;
        } else if(hypotenuse * hypotenuse + leg2 * leg2 == leg1 * leg1) {
            hypotenuse = 3;
            leg1 = 5;
            leg2 = 4;
        }

        System.out.println("Треугольник существует. Гипотенуза треугольника " + hypotenuse + ", катеты треугольника равны " + leg1 + " и " + leg2);

        int triangleArea = leg1 * leg2 / 2;
        System.out.println("Площадь треугольника " + triangleArea);

        char st = '|';
        char bSl = '\\';
        char uL = '_';
        char sp = ' ';

        System.out.println("" + st + bSl);
        System.out.println("\n" + st + sp + sp + bSl);
        System.out.println("\n" + st + uL + uL + uL + uL + bSl);

        //Подсчет количества банкнот
        System.out.println("\nПодсчет количества банкнот");

        int moneyTotal = 567;
        int nominal1 = 1;
        int nominal10 = 10;
        int nominal50 = 50;
        int nominal1Qnt = 0;
        int nominal10Qnt = 0;
        int nominal50Qnt = 0;
        int calculatedTotal = 0;

        nominal50Qnt = moneyTotal / nominal50;
        nominal10Qnt = (moneyTotal - nominal50Qnt * nominal50) / nominal10;
        nominal1Qnt = (moneyTotal - nominal50Qnt * nominal50 - nominal10Qnt * nominal10);
        calculatedTotal = nominal50Qnt * nominal50 + nominal10Qnt * nominal10 + nominal1Qnt * nominal1;

        System.out.println("Количество банкнот номинала " + nominal50 + " равно " + nominal50Qnt);
        System.out.println("Количество банкнот номинала " + nominal10 + " равно " + nominal10Qnt);
        System.out.println("Количество банкнот номинала " + nominal1 + " равно " + nominal1Qnt);
        System.out.println("Подсчитанная исходная сумма " + calculatedTotal);
    }
}
