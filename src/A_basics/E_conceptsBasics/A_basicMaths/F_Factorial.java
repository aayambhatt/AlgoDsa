package A_basics.E_conceptsBasics.A_basicMaths;

public class F_Factorial {
    public static void main(String[] args) {
        System.out.println(factorialOfANumber(3));
        System.out.println(factorialOfANumber(0));
        System.out.println(factorialOfANumber(20));

    }

    public static long factorialOfANumber(int n){
        long fact = 1;
        if(n==0){
            return 1;
        }

        for(int i = 1 ; i<=n ; i++){
            fact = fact*i;
        }

        return fact;


    }
}
