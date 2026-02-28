package A_basics.E_conceptsBasics.A_basicMaths;

public class D_IsPalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isBoolean(123));

    }

    public static boolean isBoolean(int n){
        if(n==0) return true;
        int revNum = 0;
        int origNum = n;
        while(n>0){
            int ld = n % 10;
            revNum = revNum*10 + ld;

            if(revNum==origNum){
                return true;
            }

            n = n/10;
        }
        return false;


    }
}
