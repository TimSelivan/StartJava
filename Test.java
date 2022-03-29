public class Test {
    public static void main(String[] args) {
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

    }
}