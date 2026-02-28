package A_basics.E_conceptsBasics.A_basicMaths;

public class A_CountAllDigitsInANumber {
    public static void main(String[] args) {
        System.out.println(CountDigits(24));
    }

    public static int CountDigits(int n) {
        if (n == 0) return 1;
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }
}
