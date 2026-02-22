package A_basics.D_Collections;

import java.util.Arrays;

public class CustomClasses {
    public static void main(String[] args) {
       MyData obj = new MyData(5, "Aayam", new int[]{1, 2, 3}, 'A');
       MyData obj2 = new MyData(7, "Aaryan", new int[]{5,6,7}, 'B');

        System.out.println(obj);
        System.out.println(obj.getName());
        System.out.println(Arrays.toString(obj2.getArr()));

        obj2.setArr(new int[]{9,10,11});
        System.out.println("New Array: " + Arrays.toString(obj2.getArr()));

        System.out.println(obj2.getOtherData());
    }
}

class OtherData{
    private char ch;

    public OtherData(char ch) {
        this.ch = ch;
    }

    public char getCh() {
        return ch;
    }

    @Override
    public String toString(){
        return "Char: " + getCh();
    }
}

class MyData{
    private Integer num;
    private String name;
    OtherData otherData;

    private int[] arr;

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public MyData(Integer num, String name, int[] arr, char ch){
        this.num = num;
        this.name = name;
        this.arr = arr;
        this.otherData = new OtherData(ch);
    }

    public OtherData getOtherData() {
        return otherData;
    }

    public void setOtherData(OtherData otherData) {
        this.otherData = otherData;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "This is " + this.name;
    }
}
