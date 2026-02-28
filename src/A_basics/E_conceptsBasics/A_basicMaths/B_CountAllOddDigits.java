package A_basics.E_conceptsBasics.A_basicMaths;

public class B_CountAllOddDigits {
    public static void main(String[] args) {
        System.out.println( countAllOddDigits(15));
    }

    public static int countAllOddDigits(int n){
        int count = 0;

        while(n>0){
            int ld = n % 10;
            if(ld%2==1){
                count++;
            }
            n = n/10;
        }

        return count;
    }
}
