package A_basics.A_languageBasics;

public class Operators {
    public static void main(String[] args) {
        int num = 5;
        int secondNum = 7;
        int theirMultiply = num*secondNum;
        System.out.println(theirMultiply);

        int x = 10;
        int y = 3;
        int rem = x%y;
        System.out.println(rem);

        int num1 = 5;
        int num2 = +num1;
        System.out.println(num2);
        int num3 = -num1;
        System.out.println(num3);

        boolean fl1 = true;
        boolean fl2 = !fl1;
        System.out.println(fl2);
        boolean fl3 = !!fl1;
        System.out.println(fl3);

        int a = 5;
        int b = 7;
        boolean result = a==b;
        System.out.println(result);
        boolean result1 = a!=b;
        System.out.println(result1);

        // &&, ||
        boolean first = true;
        boolean second = false;
        System.out.println(first && second);
        System.out.println(first || second);

        int q = 12;
        int r = 6;
        int someValue = 10;
        someValue += r + q;
        System.out.println(someValue);

        int n = 8;
        int m = 4;
        String res = m > n ? "Thats true" : "Thats false";
        System.out.println(res);





    }
}
