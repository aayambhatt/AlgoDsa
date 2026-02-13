package A_basics.B_oopsBasics;


interface JustTalking{
    void talk();

    default void sleep(){
        System.out.println("Sleeping....");
    }
}

class Engineer implements JustTalking{
   public void talk(){
       System.out.println("Engineer Documenting");
    }

    @Override
    public void sleep(){
        System.out.println("Engineer dont sleep");
    }
}


public class InterfaceDemo {
    public static void main(String[] args) {

        Engineer en1 = new Engineer();
        en1.talk();
        en1.sleep();

    }
}
