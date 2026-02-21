package A_basics.D_Collections;

public class CustomClasses {
    public static void main(String[] args) {
       MyData obj = new MyData(5, "Aayam");
       MyData obj2 = new MyData(7, "Aaryan");

        System.out.println(obj);
        System.out.println(obj.getName());
    }
}

class MyData{
    private Integer num;
    private String name;

    public MyData(Integer num, String name){
        this.num = num;
        this.name = name;
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
