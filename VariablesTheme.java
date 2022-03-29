public class VariablesTheme {
    public static void main(String[] args) {
        //Создание переменных и вывод их значений на консоль
        System.out.println("\nСоздание переменных и вывод их значений на консоль");

        byte processorCores = 4;
        short ram = 8;
        int os = 64;
        long buildNumber = 1254879625485L;
        float gHz = 2.10f;
        double productCode = 125478.256485d;
        char firstNameLetter = 'A';
        boolean pcForCode = true;

        System.out.println(processorCores);
        System.out.println(ram);
        System.out.println(os);
        System.out.println(buildNumber);
        System.out.println(gHz);
        System.out.println(productCode);
        System.out.println(firstNameLetter);
        System.out.println(pcForCode);

        //Расчет соимости товара со скидкой
        System.out.println("\nРасчет стоимости товара со скидкой");

        int priceX = 100;
        int priceY = 200;
        float discountRate = 0.11f;

        System.out.print("Сумма товаров со скидкой ");
        System.out.println((priceX + priceY) * (1 - discountRate));
        System.out.print("Сумма скидки ");
        System.out.println((priceX + priceY) * discountRate);

        //Вывод на консоль слова JAVA
        System.out.println("\nВывод на консоль слова JAVA");

        System.out.println("   J    a  v     v  a   ");
        System.out.println("   J   a a  v   v  a a  ");
        System.out.println("J  J  aaaaa  V V  aaaaa ");
        System.out.println(" JJ  a     a  V  a     a");

        //Отображение min и max значений числовых типов данных
        System.out.println("\nОтображение min и max значений числовых типов данных");

        byte maxByte = 127;
        short maxShort = 32767;
        int maxInt = 2147483647;
        long maxLong = 9223372036854775807L;

        System.out.println(maxByte);
        System.out.println(maxShort);
        System.out.println(maxInt);
        System.out.println(maxLong);

        System.out.println(++maxByte);
        System.out.println(++maxShort);
        System.out.println(++maxInt);
        System.out.println(++maxLong);
        System.out.println(--maxByte);
        System.out.println(--maxShort);
        System.out.println(--maxInt);
        System.out.println(--maxLong);

        //Перестановка значений переменных
        System.out.println("\nПерестановка значений переменных");

        float x = 0.5f;
        float y = 0.7f;

        System.out.println(x);
        System.out.println(y);

        float z = 0.2f;

        x += z;
        y -= z;

        System.out.println(x);
        System.out.println(y);

        //Вывод символов и их кодов
        System.out.println("\nВывод символов и их кодов");

        int a = 35;
        int b = 38;
        int c = 64;
        int d = 94;
        int e = 95;

        System.out.print(a);
        System.out.println((char) a);
        System.out.print(b);
        System.out.println((char) b);
        System.out.print(c);
        System.out.println((char) c);
        System.out.print(d);
        System.out.println((char) d);
        System.out.print(e);
        System.out.println((char) e);

        //Произведение и сумма цифр числа
        System.out.println("\nПроизведение и сумма цифр числа");

        int srcNum = 345;
        int sum = 0;
        int product = 0;
        int curNum;

        curNum = srcNum % 10;
        sum += curNum;
        product += curNum;
        srcNum /= 10;
        curNum = srcNum % 10;
        sum += curNum;
        product *= curNum;
        srcNum /= 10;
        sum += srcNum;
        product *= srcNum;

        System.out.println(sum);
        System.out.println(product);

        //Вывод на консоль ASCII-арт Дюка
        System.out.println("\nВывод на консоль ASCII-арт Дюка");

//    /\      
//   /  \     
//  /_( )\    
// /      \   
///____/\__\

        char sl = '/';
        char bSl = '\\';
        char ul = '_';
        char oQ = '(';
        char cQ = ')';
        char sp = ' ';

        System.out.println("" + sp + sp + sp + sp + sl + bSl);
        System.out.println("" + sp + sp + sp + sl + sp + sp + bSl);
        System.out.println("" + sp + sp + sl + ul + oQ + sp + cQ + bSl);
        System.out.println("" + sp + sl + sp + sp + sp + sp + sp + sp + bSl);
        System.out.println("" + sl + ul + ul + ul + ul + sl + bSl + ul + ul + bSl);

        //Отображение количества сотен, десятков и единиц числа
        System.out.println("\nОтображение количества сотен, десятков и единиц числа");

        int num123 = 123;
        int hun = num123 / 100;
        int doz = num123 / 10 % 10;
        int un = num123 % 10;

        System.out.println(hun);
        System.out.println(doz);
        System.out.println(un);

        //Преобразование секунд
        System.out.println("\nПреобразование секунд");

        int totalSec = 86399;
        int hour = totalSec / 3600;
        int min = (totalSec - hour * 3600) / 60;
        int sec = (totalSec - hour * 3600 - min * 60);

        System.out.println(hour + ":" + min + ":" + sec);
    }
}