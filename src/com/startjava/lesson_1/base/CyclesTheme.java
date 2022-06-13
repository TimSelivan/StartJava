package com.startjava.lesson_1.base;

public class CyclesTheme {
    public static void main(String[] args) {
        //Подсчет суммы четных и нечетных чисел
        System.out.println("\nПодсчет суммы четных и нечетных чисел");

        int counter = -10;
        int sumEven = 0;
        int sumOdd = 0;

        do {
            if(counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while(counter <= 21);

        System.out.println("Сумма четных чисел равна " + sumEven + ", Сумма нечетных чисел равна " + sumOdd);

        //Вывод чисел между max и min
        System.out.println("\nВывод чисел между max и min");

        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int minNum;
        int maxNum;

        if(num1 > num2) {
            maxNum = num1;
        } else {
            maxNum = num2;
        }
        if(num1 > num3) {
            maxNum = num1;
        } else {
            maxNum = num3;
        }
        if(num1 > num2) {
            minNum = num2;
        } else {
            maxNum = num1;
        }
        if(num1 > num3) {
            minNum = num3;
        } else {
            minNum = num1;
        }

        maxNum--;
        for(int i = maxNum; i > minNum; i--) {
            System.out.println(i);
        }

        //Вывод реверсивного числа и суммы его цифр
        System.out.println("\nВывод реверсивного числа и суммы его цифр");

        int srcNum = 1234;
        int sumNum = 0;
        int digit;

        while(srcNum != 0) {
            digit = srcNum % 10;
            System.out.print(digit);
            sumNum += digit;
            srcNum /= 10;
        }

        System.out.println("\n" + sumNum);

        //Вывод чисел на консоль в несколько строк
        System.out.println("\nВывод чисел на консоль в несколько строк");

        int cntr = 2;

        for(int i = 1; i <= 24; i += 2) {
            if(cntr <= 5) {
                System.out.format("%2d ", i);
            } else {
                System.out.format("%2d %n", i);
                cntr = 1;
            }
            cntr++;
        }

        int digitNum = 24 / 2;
        int spareSpace = 15 - digitNum;

        for(int i = 1; i <= spareSpace; i++) {
            System.out.print(" 0 ");
        }

        System.out.println("");

        //Проверка количества единиц на четность
        System.out.println("\nПроверка количества единиц на четность");

        srcNum = 3141591;
        int sumNum1 = 0;

        while(srcNum != 0) {
            if(srcNum % 10 == 1) {
                sumNum1++;
            }
            srcNum /= 10;
        }

        System.out.println("Количество единиц " + sumNum1);

        if(sumNum1 % 2 == 0) {
            System.out.println("Количество единиц является четным");
        } else {
            System.out.println("Количество единиц является нечетным");
        }

        //Отображение фигур в консоли
        System.out.println("\nОтображение фигур в консоли");

        char asterisk = '*';
        int cntr1 = 1;

        for(int i = 1; i <= 50; i++) {
            if(cntr1 <= 10) {
            System.out.print(asterisk);
            } else {
            System.out.print("\n" + asterisk);
            cntr1 = 1;
            }
        cntr1++;
        }

        System.out.println("");

        int j = 1;
        char hesh = '#';

        while(j <= 15) {
            if(j <= 5) {
                System.out.print(hesh);
            } else if(j == 6) {
                System.out.print("\n" + hesh);
            } else if(j > 6 && j <= 9) {
                System.out.print(hesh);
            } else if(j == 10) {
                System.out.print("\n" + hesh);
            } else if(j > 10 && j <= 12) {
                System.out.print(hesh);
            } else if(j == 13) {
                System.out.print("\n" + hesh);
            } else if(j > 13 && j <= 14) {
                System.out.println(hesh);
            } else {
                System.out.println(hesh);
            }
        j++;
        }

        char ace = '$';
        int h = 1;

        do {
            if(h == 1) {
                System.out.println(ace);
            } else if(h > 1 && h < 4) {
                System.out.print(ace);
            } else if(h == 4) {
                System.out.print("\n" + ace);
            } else if(h > 4 && h < 7) {
                System.out.print(ace);
            } else if(h == 7) {
                System.out.print("\n" + ace);
            } else if(h > 7 && h < 9) {
                System.out.print(ace);
            } else {
                System.out.println("\n" + ace);
            }
            h++;
        } while(h <= 9);

        //Отображение ASCII - символов
        System.out.println("\nОтображение ASCII - символов");

        System.out.println("Dec Char");
        //В блок проверки можно поставить условие i <= 255 для вывода всех значений и соответствующих им символов
        for(int i = 0; i <= 6; i++) {
            System.out.format("%3d",i);
            System.out.format(" %c", (char) i);
            System.out.format("\n");
        }

        //Проверка, является ли число палиндромом
        System.out.println("\nПроверка, является ли число палиндромом");

        srcNum = 12321;
        int curDigit;
        int revSrcNum = 0;
        int curNum = srcNum;

        while(curNum != 0) {
            curDigit = curNum % 10;
            revSrcNum = (revSrcNum * 10) + curDigit;
            curNum /= 10;
        }
        if(revSrcNum == srcNum) {
            System.out.println("Число " + srcNum + " является палиндромом");
        } else {
            System.out.println("Число " + srcNum + " не является палиндромом");
        }

        //Определение, является ли число счастливым
        System.out.println("\nОпределение, является ли число счастливым");

        int luckyNum = 972486;
        int a = luckyNum % 10;
        int b = luckyNum / 10 % 10;
        int c = luckyNum / 100 % 10;
        int x = luckyNum / 1000 % 10;
        int y = luckyNum / 10000 % 10;
        int z = luckyNum / 100000;
        int firstHfSum = a + b + c;
        int lastHfSum = x + y + z;

        System.out.println(a + " + " + b + " + " + c + " = " + firstHfSum);
        System.out.println(x + " + " + y + " + " + z + " = " + lastHfSum);

        if(firstHfSum == lastHfSum) {
            System.out.println("Число " + luckyNum + " является счастливым");
        } else {
            System.out.println("Число " + luckyNum + " не является счастливым");
        }

        //Вывод таблицы умножения Пифагора
        System.out.println("\nВывод таблицы умножения Пифагора");

        for(int i = 1; i <= 9; i++) {
            if(i == 1) {
                System.out.format("   ");
            } else {
                System.out.format("%2d ", i);
            }
            for(int k = 2; k <= 9; k++) {
                System.out.format("%2d ", i * k);
            }
            System.out.print("\n");
        }
    }
}