package A_basics.A_languageBasics;

public class Strings {
    public static void main(String[] args) {
        String myName = "Aayam Bhatt";
        int len = myName.length();
        System.out.println(len);

        char thirdCharacter = myName.charAt(2);
        System.out.println(thirdCharacter);
        char lastCharacter = myName.charAt(len-1);
        System.out.println(lastCharacter);
        String firstName = myName.substring(0,5);
        System.out.println(firstName);

        String first = "Aayam";
        String last = "Bhatt";

        String full = first + " " + last;
        System.out.println(full);

        boolean isSame = first.equals(last);
        System.out.println(isSame);
        boolean chechOther = full.equals(myName);
        System.out.println(chechOther);

    }
}
