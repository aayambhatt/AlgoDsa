package A_basics.B_oopsBasics;

class Test {
    public static void main(String[] args){
//        Demo.printDemo();
//        WithoutStatic withoutStatic = new WithoutStatic();
//        withoutStatic.nowPrint();
        Person person = new Person();
        person.assignAge(23);
        Person person1 = new Person();
        person1.assignAge(24);

        System.out.println(person1.age);
    }
}

class Demo{
    public static void printDemo(){
        System.out.println("Demo!");
    }
}

class WithoutStatic{
    public void nowPrint(){
        System.out.println("No static!");
    }
}

class Person{
    int age;
    public void assignAge(int num){
        age = num;
    }
}


