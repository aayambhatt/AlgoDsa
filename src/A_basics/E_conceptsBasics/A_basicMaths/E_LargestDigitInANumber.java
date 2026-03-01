package A_basics.E_conceptsBasics.A_basicMaths;

public class E_LargestDigitInANumber {
    public static void main(String[] args) {
        System.out.println(largestDigit(25));

    }

    public static int largestDigit(int n){
        int maxD = 0;

        while(n>0){
            int ld = n % 10;
            if(ld > maxD){
                maxD = ld;
            }
            n = n / 10;
        }

        return maxD;
    }
}
