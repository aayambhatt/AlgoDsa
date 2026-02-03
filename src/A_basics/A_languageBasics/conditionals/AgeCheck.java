package A_basics.A_languageBasics.conditionals;

import java.util.Scanner;

public class AgeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if(age>=18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Teen");
        }



    }
}
