package A_basics.D_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class ComparatorUsage {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(4);
        al.add(6);
        al.add(2);
        al.add(7);

        Collections.sort(al, getComparator());
        System.out.println(al);

    }


   public static Comparator<Integer> getComparator(){
      return new Comparator<Integer>() {
          @Override
          public int compare(Integer num1, Integer num2) {
              if (num1 < num2) {
                  return 1;
              } else if (num1 > num2) {
                  return -1;
              }
              return 0;

          }
      };
    }
}
