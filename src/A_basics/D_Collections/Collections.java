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
       arrayList.add(12);
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

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(8);
        treeSet.add(4);
        treeSet.add(9);
        for(int n : treeSet){
            System.out.println(n);
        }

        /*
        FIFO
         */
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.offer(6);
        arrayDeque.offer(10);
        arrayDeque.offer(9);
        System.out.println(arrayDeque.peek());
        arrayDeque.poll();
        System.out.println(arrayDeque.peek());

        /*
        Stores elements, and whenever you ask for peek, it gives us smallest element
         */
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(8);
        priorityQueue.offer(5);
        priorityQueue.offer(14);
        System.out.println(priorityQueue.peek());
        while (!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.peek());
            priorityQueue.poll();
        }

        /*
        Map:
        Key, Value
         */
        HashMap<Integer, String> aboutStudent = new HashMap<>();
        aboutStudent.put(6, "Aayam");
        aboutStudent.put(7, "Aaryan");
        aboutStudent.put(48,"Glory");
        aboutStudent.put(25,"Abhi");
        System.out.println(aboutStudent);
        System.out.println(aboutStudent.get(7));
        System.out.println(aboutStudent.remove(25));
        System.out.println(aboutStudent);

        Iterator<Integer> iterator = arrayList.iterator();
        while(iterator.hasNext()){
          Integer num = iterator.next();
         System.out.println(num);
        }

        /*
        Custom Algorithms
         */
     System.out.println(arrayList);
     java.util.Collections.sort(arrayList);
     System.out.println(arrayList);
     System.out.println(java.util.Collections.frequency(arrayList, 12));


    }

}

