package com.startjava.lesson_2_3_4.arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] array1 = {1, 2, 3, 4, 5, 6, 7};
        int[] arrayReversed = new int[array1.length];
        for(int i = 0; i < array1.length; i++) {
            arrayReversed[i] = array1[array1.length - 1 - i];
        }
        printIntArray(array1);
        printIntArray(arrayReversed);

        System.out.println("\n2. Вывод произведения элементов массива");
        int[] array2 = {0, 1, 2 ,3, 4, 5, 6, 7, 8, 9};
        int mult = 1;
        for(int i = 1; i < array2.length - 1; i++) {
            mult *= array2[i];
        }
        for(int i = 1; i < array2.length; i++) {
            if(array2[i] == array2.length - 1) {
                System.out.print(" = " + mult);
            } else if(array2[i] == array2.length - 2) {
                System.out.print(array2[i]);
            } else {
                System.out.print(array2[i] + " * ");
            }
        }
        System.out.println("\nПервый элемент массива " + array2[0] + ", последний элемент массива " + array2[array2.length - 1]);

        System.out.println("\n3. Удаление элементов массива");
        double[] array3 = new double[15];
        for(int i = 0; i < array3.length; i++) {
            array3[i] = Math.random();
        }
        double[] array3Modified = new double[15];
        int modifiedCount = 0;
        for(int i = 0; i < array3.length; i++) {
            if(array3[7] < array3[i]) {
                array3Modified[i] = 0;
                modifiedCount += 1;
            } else {
                array3Modified[i] = array3[i];
            }
        }
        printDoubleArray(array3);
        printDoubleArray(array3Modified);
        System.out.println("Количество измененных ячеек " + modifiedCount);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] englishAlphabet = new char[26];
        for(int i = 0; i < englishAlphabet.length; i++) {
            englishAlphabet[i] = (char) (65 + i);
        }
        int counter = 1;
        for(int i = 0; i < englishAlphabet.length; i++) {
            for(int j = 0; j < counter; j++) {
                System.out.print(englishAlphabet[englishAlphabet.length - 1 - j]);
            }
            System.out.println();
            counter++;
        }

        System.out.println("\n5. Генерация уникальных чисел");
        //( Math.random() * (b-a) ) + a, [a,b)
        //[60,100] -> [60,101) -> (Math.random() * (101 - 60) + 60 -> Math.random() * 41 + 60
        int[] array4 = new int[30];
        for(int i = 0; i < array4.length; i++) {
            int randomNumber = (int) (Math.random() * 40 + 60);
            for(int j = 0; j <= i; j++) {
                if(i == j && randomNumber != array4[j]) {
                    array4[i] = randomNumber;
                } else if(randomNumber == array4[j]) {
                    i--;
                    break;
                }
            }
        }
        //сортировка массива методом пузырька
        for(int i = array4.length - 1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if(array4[j] > array4[j + 1]) {
                    int temp = array4[j];
                    array4[j] = array4[j + 1];
                    array4[j +1] = temp;
                }
            }
        }
        //вывод массива на консоль по 10 цифр в строке
        for(int i = 0; i < array4.length; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.print(array4[i] + " ");
                i++;
            }
            i--;
            System.out.println();
        }

        System.out.println("\n6. Сдвиг элементов массива");
        String[] strings = {"", "AA", "", "", "BBB", "C", "", "DDDD"};
        int blankCounter = 0;
        for(int i = 0; i < strings.length; i++) {
            if(strings[i].isBlank()) {
                continue;
            } else {
                blankCounter += 1;
            }
        }
        String[] stringsWithNoBlanks = new String[blankCounter];
        int x = 0;
        for(int i = 0; i < strings.length; i++) {
            if(strings[i].isBlank()) {
                continue;
            } else {
                stringsWithNoBlanks[x] = strings[i];
                x++;
            }
        }
        String[] strings2 = new String[blankCounter];
        System.arraycopy(stringsWithNoBlanks, 0, strings2, 0, blankCounter);
        printStringArray(strings);
        printStringArray(strings2);
    }
    public static void printIntArray(int[] array) {
        for(int i: array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void printDoubleArray(double[] array) {
        for(double i: array) {
            System.out.println(i + " ");
        }
        System.out.println();
    }
    public static void printStringArray(String[] str) {
        for(String i: str) {
            System.out.print(i + ".");
        }
        System.out.println();
    }
}
