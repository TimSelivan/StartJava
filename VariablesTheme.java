public class VariablesTheme {
    public static void main(String[] args) {

        //Создание переменных и вывод их значений на консоль

        System.out.println("Создание переменных и вывод их значений на консоль");

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

        System.out.println("");

        //Расчет соимости товара со скидкой

        System.out.println("Расчет стоимости товара со скидкой");

        int productX = 100;
        int productY = 200;
        float discountRate = 0.11f;

        System.out.print("Сумма товаров со скидкой ");
        System.out.println(productX * (1-discountRate) + productY * (1-discountRate));
        System.out.print("Сумма скидки ");
        System.out.println(productX * discountRate + productY * discountRate);

        System.out.println("");

        //Вывод на консоль слова JAVA

        System.out.println("Вывод на консоль слова JAVA");

        System.out.println("   J    a  v     v  a   ");
        System.out.println("   J   a a  v   v  a a  ");
        System.out.println("J  J  aaaaa  V V  aaaaa ");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("");

        //Отображение min и max значений числовых типов данных

        System.out.println("Отображение min и max значений числовых типов данных");

        byte maxByte = 127;
        short maxShort = 32767;
        int maxInt = 2147483647;
        long maxLong = 9223372036854775807L;

        System.out.println(maxByte);
        System.out.println(maxShort);
        System.out.println(maxInt);
        System.out.println(maxLong);

        ++maxByte;
        ++maxShort;
        ++maxInt;
        ++maxLong;
        --maxByte;
        --maxShort;
        --maxInt;
        --maxLong;

        System.out.println(++maxByte);
        System.out.println(++maxShort);
        System.out.println(++maxInt);
        System.out.println(++maxLong);
        System.out.println(--maxByte);
        System.out.println(--maxShort);
        System.out.println(--maxInt);
        System.out.println(--maxLong);

        System.out.println("");

        //Перестановка значений переменных

        System.out.println("Перестановка значений переменных");

        float x = 0.5f;
        float y = 0.7f;

        System.out.println(x);
        System.out.println(y);

        float z = 0.2f;

        x = x + z;
        y = y - z;

        System.out.println(x);
        System.out.println(y);

        System.out.println("");

        //Вывод символов и их кодов

        System.out.println("Вывод символов и их кодов");

        int a = 35;
        int b = 38;
        int c = 64;
        int d = 94;
        int e = 95;

        System.out.print(a);
        System.out.println(" #");
        System.out.print(b);
        System.out.println(" &");
        System.out.print(c);
        System.out.println(" @");
        System.out.print(d);
        System.out.println(" ^");
        System.out.print(e);
        System.out.println(" _");

        System.out.println("");

        //Произведение и сумма цифр числа

        System.out.println("Произведение и сумма цифр числа");

        byte num3 = 3;
        byte num4 = 4;
        byte num5 = 5;

        System.out.println(num3 * num4 * num5);
        System.out.println(num3 + num4 + num5);

        System.out.println("");

        //Вывод на консоль ASCII-арт Дюка

        System.out.println("Вывод на консоль ASCII-арт Дюка");

//    /\      
//   /  \     
//  /_( )\    
// /      \   
///____/\__\

        char sl = '/';
        char rSl = '\\';
        char ul = '_';
        char oQ = '(';
        char cQ = ')';
        char sp = ' ';

        System.out.print(sp);
        System.out.print(sp);
        System.out.print(sp);
        System.out.print(sp);
        System.out.print(sl);
        System.out.println(rSl);
        System.out.print(sp);
        System.out.print(sp);
        System.out.print(sp);
        System.out.print(sl);
        System.out.print(sp);
        System.out.print(sp);
        System.out.println(rSl);
        System.out.print(sp);
        System.out.print(sp);
        System.out.print(sl);
        System.out.print(ul);
        System.out.print(oQ);
        System.out.print(sp);
        System.out.print(cQ);
        System.out.println(rSl);
        System.out.print(sp);
        System.out.print(sl);
        System.out.print(sp);
        System.out.print(sp);
        System.out.print(sp);
        System.out.print(sp);
        System.out.print(sp);
        System.out.print(sp);
        System.out.println(rSl);
        System.out.print(sl);
        System.out.print(ul);
        System.out.print(ul);
        System.out.print(ul);
        System.out.print(ul);
        System.out.print(sl);
        System.out.print(rSl);
        System.out.print(ul);
        System.out.print(ul);
        System.out.println(rSl);

        System.out.println("");

        //Отображение количества сотен, десятков и единиц числа

        System.out.println("Отображение количества сотен, десятков и единиц числа");

        int num123 = 123;
        int hun = num123/100;
        int doz = num123/10;
        int un = num123/1;

        System.out.println(hun);
        System.out.println(doz);
        System.out.println(un);

        System.out.println("");

        //Преобразование секунд

        System.out.println("Преобразование секунд");

        int secAll = 86399;
        int hour = secAll/3600;
        int min = (secAll - hour * 3600)/60;
        int sec = (secAll - hour * 3600 -min*60);

        System.out.println(hour + ":" + min + ":" + sec);
    }
}