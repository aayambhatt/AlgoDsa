package A_basics.B_oopsBasics;

// Abstract class represents a general concept of a Course
// It cannot be instantiated directly
abstract class Course {

    // Common property shared by all courses
    String courseName;

    // Abstract methods: subclasses MUST provide implementation
    abstract void addCourse(String courseName);
    abstract void removeCourse();
}


// Concrete class representing a Programming course
class ProgrammingCourse extends Course {

    // When adding a course, we assign the name
    // and show a message
    @Override
    public void addCourse(String courseName) {
        this.courseName = courseName;   // "this" refers to current object
        System.out.println("Programming course added: " + this.courseName);
    }

    // Removing course just clears the name
    @Override
    public void removeCourse() {
        System.out.println("Programming course removed: " + this.courseName);
        this.courseName = null;
    }
}


// Concrete class representing a Science course
class ScienceCourse extends Course {

    // A science course always has this compulsory subject
    String compulsoryCourse = "Fundamentals of Physics";

    @Override
    void addCourse(String courseName) {
        this.courseName = courseName;
        System.out.println("Science course added: " + this.courseName);
        System.out.println("Compulsory subject: " + compulsoryCourse);
    }

    @Override
    void removeCourse() {
        System.out.println("Science course removed: " + this.courseName);
        this.courseName = null;
    }
}

class MathCourse extends Course{
    String compulsorySubject = "Discrete Mathematics";

    @Override
    public void addCourse(String courseName){
        this.courseName = courseName;
        System.out.println("Math course added: " + this.courseName);
        System.out.println("Compulsory Subject: " + compulsorySubject);
    }

    @Override
    public void removeCourse(){
        System.out.println("Math course removed: " + this.courseName);
        this.courseName = null;

    }
}


public class AbstractionDemo {
    public static void main(String[] args) {

        // We use the abstract type as the reference
        // This is called "programming to abstraction"
        Course programming = new ProgrammingCourse();
        Course science = new ScienceCourse();

        programming.addCourse("Java Fundamentals");
        science.addCourse("Physics Major");

        System.out.println();

        programming.removeCourse();
        science.removeCourse();
    }
}
