package A_basics.D_Collections;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        /*
        Array
         */
       ArrayList<Integer> arrayList = new ArrayList<>();
       arrayList.add(56);
       System.out.println(arrayList);
       arrayList.add(43);
       arrayList.add(12);
       System.out.println(arrayList);
       System.out.println(arrayList.size());
       System.out.println(arrayList.get(1));
        System.out.println(arrayList.remove(2));
        System.out.println(arrayList);
        arrayList.add(2,55);
        System.out.println(arrayList);
        System.out.println(arrayList.contains(43));

        /*
        LinkedList
         */
        LinkedList<String> linkedNames = new LinkedList<>();
        linkedNames.add("Cccc");
        linkedNames.add("Dddd");
        System.out.println(linkedNames);
        linkedNames.addFirst("Aaaa");
        System.out.println(linkedNames);
        System.out.println(linkedNames.getFirst());

        /*
        Stack
         */
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(4);
        System.out.println(st);
        System.out.println(st.peek());

        /*
        Vector
         */
        Vector<Integer> vector = new Vector<>();

        /*
        Set
         */
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(2);
        hashSet.add(1);
        hashSet.add(1);
        System.out.println(hashSet);


    }

}
