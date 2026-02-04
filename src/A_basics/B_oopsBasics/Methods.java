package A_basics.B_oopsBasics;

public class Methods {
    public static void main(String[] args) {
        Testing add1 = new Testing();
        int res = add1.sum(5,6);
        System.out.println(res);

    }
}

class Testing{
    public int sum(int a, int b){
        return a+b;
    }

}