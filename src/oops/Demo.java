package oops;

public class Demo {
    public static void main(String[] args) {
        // now creating object of Student
        Student st0 = new Student();
        System.out.println();

        Student st1;
        st1 = new Student(123,"RAM", "Delhi");

//        st1.studentName = "RAM";
//        st1.studentId=123;
//        st1.studentCity="Delhi";

        st1.study();
        st1.showFullDetails();
        System.out.println();

        Student st2 = new Student(171, "SHYAM", "MUMBAI");
        st2.study();
        st2.showFullDetails();

        st2.study((float) 7.3);

        Dog d1 = new Dog();
        d1.eating();
        System.out.println(d1.color);

        d1.getX();

    }
}


// Object Creation:
// st1 : A container, stores Object's reference.
// new keyword : is used to create Dynamic Memory in Java in RAM.

