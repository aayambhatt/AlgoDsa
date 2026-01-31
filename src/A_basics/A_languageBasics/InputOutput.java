package A_basics.A_languageBasics;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num);

        String name = scanner.nextLine();
        System.out.println(name);



        scanner.close();
    }
}
