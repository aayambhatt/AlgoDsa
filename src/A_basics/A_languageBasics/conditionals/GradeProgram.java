package A_basics.A_languageBasics.conditionals;

import java.util.Scanner;

public class GradeProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your marks: ");

        int marks = scanner.nextInt();

        if(marks>=90){
            System.out.println("A");
        }
        else if(marks>=70){
            System.out.println("B");
        }
        else if(marks>=50){
            System.out.println("C");
        }
        else if(marks>=35){
            System.out.println("D");
        }
        else{
            System.out.println("Failed");
        }

    }
}
