package A_basics.A_languageBasics;

public class ArraysStudy {
    public static void main(String[] args) {
        // an array of 5 size is declared
        int[] arr = new int[5];
        arr[0]  = 1;
        arr[1] = 6;
        arr[2] = 8;
        arr[3] = 12;
        arr[4] = 9;

        for(int i : arr){
            System.out.println(i);
        }


    }
}
