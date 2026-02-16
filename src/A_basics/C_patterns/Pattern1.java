package A_basics.C_patterns;

/*
Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

*****
*****
*****
*****
*****
 */

public class Pattern1 {
    public static void main(String[] args) {
        Pattern_1.pattern1(4);
        System.out.println();
        Pattern_1.pattern1(2);
        System.out.println();
        Pattern_1.pattern1(5);

    }
}

class Pattern_1{
    public static void pattern1(int n){
        for(int i = 0 ; i < n ; i++){
            System.out.print("*");
            for(int j = 0 ; j<n-1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
