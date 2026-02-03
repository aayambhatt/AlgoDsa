package A_basics.A_languageBasics;

public class A_Exception {
    public static void main(String[] args) {
        try{
            int num1 = 10;
            int num2 = 0;
            int result = num1 / num2;
            System.out.println(result);
        } catch (Exception e){
            System.out.println("Exception: " + e);
        } finally {
            System.out.println("Done");
        }

    }
}
