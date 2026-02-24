package A_basics.D_Collections;
import java.util.Set;
import java.util.TreeSet;

class StudentUsingComparatorForTreeSet implements Comparable<StudentUsingComparatorForTreeSet> {
    int id;

    StudentUsingComparatorForTreeSet(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(StudentUsingComparatorForTreeSet other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Student{id=" + id + "}";
    }
}

public class TreeSetDemo {
    public static void main(String[] args) {

        Set<StudentUsingComparatorForTreeSet> set = new TreeSet<>();

        set.add(new StudentUsingComparatorForTreeSet(2));
        set.add(new StudentUsingComparatorForTreeSet(1));
        set.add(new StudentUsingComparatorForTreeSet(3));

        System.out.println(set);
    }
}