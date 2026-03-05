package A_basics.E_conceptsBasics.A_basicMaths;

public class G_ArmstrongNumber {

    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(153));
        System.out.println(isArmstrongNumber(12));
    }

    private static int countDigit ( int n){
        int count = (int) (Math.log10(n)) + 1;
        return count;
    }

    public static boolean isArmstrongNumber(int n) {

        int count = countDigit(n);
        int sum = 0;
        int origNo = n;

        while (n > 0) {
            int ld = n % 10;

            sum = sum + (int) Math.pow(ld, count);

            n = n / 10;
        }

        return origNo == sum;

    }
}




