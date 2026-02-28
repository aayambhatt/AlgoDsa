package A_basics.E_conceptsBasics.A_basicMaths;

public class C_ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverseNumber(56));

    }

    public static int reverseNumber(int n){
        int revNum = 0;

        while(n>0){
            int ld = n % 10;
            revNum = revNum*10 + ld;

            n = n/10;
        }

        return revNum;

    }

}

