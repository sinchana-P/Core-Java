package oops;

public class Student {
    // Data Members: Instance Variables
    int studentId;
    String studentName;
    String studentCity;

    // Constructor to initialize data members
    public Student(int id, String name, String city) {
        studentId = id;
        studentName = name;
        studentCity = city;
    }

    // Member methods (functions)
    public void study() {
        System.out.println(studentName + " is studying");
    }

    public void showFullDetails() {
        System.out.println("My name is: " + studentName);
        System.out.println("My id is: " + studentId);
        System.out.println("My city is: " + studentCity);
    }

    public static void main(String[] args) {
        // Creating a Student object and initializing its data members
        Student student = new Student(1, "John", "New York");

        // Calling methods on the Student object
        student.study();
        student.showFullDetails();
    }
}



//package oops;
//
//public class Student {
//    public static void main(String[] args) {
//        // data: Data Members: Instance Variables
//        int studentId;
//        String studentName;
//        String studentCity;
//
//        // Behaviour: Member methods : Methods : Functions
//        public void study(){
//            System.out.println(studentName + " is studying ");
//        }
//
//        public void showFullDetails() {
//            System.out.println("My name is : " + studentName);
//            System.out.println("My id is : "+ studentId);
//            System.out.println("My city is : " + studentCity);
//        }
//
////  The code is incorrect, because
////  it mixes the declaration of data members (fields) and methods within the main method of the Student class.
////  In Java, data members and methods should be declared within the class body, but not inside the main method.
//
//    }
//}









// OOPS: Object Oriented Programming System

// Program -> Style, Paradigm, Methodology
// 1. Procedural Programming -> one uses procedures.
// 2. Functional Programming -> one uses functions to write whole program.
// 3. OOPS Programming -> one uses Class & Objects to write program.
        // OOPS, provides more benefits/features like : Polymorphism, Inheritance, Abstraction etc...

// OOPS : is a concept,
    // languages supports: C++, Java, Python

// Class:
// * Logical Entity : Originally doesn't exist
// * It has Properties (Data) & Behaviours (Methods)
// Car
// On Paper -> Theory -> Properties (color, shape) -> Behaviour (move, light)
// On Paper Ready

// Object:
// * Real Entity
// * It gets Properties (Data) & Behaviours (Methods)



