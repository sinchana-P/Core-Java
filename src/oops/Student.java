// ---------- old code starts ------- Error ----------

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

// ---------- old code ends ------- Error ----------

package oops;

public class Student {
    // Data Members: Instance Variables
    int studentId;
    String studentName;
    String studentCity;

    // Constructor to \initialize data members
    public Student() {
        // to call other constructor in this constructor depending on the "argument".
        this(77);
        System.out.println("Creating Object : Non-Parameterized Constructor");
    }

    public Student(int a){
        System.out.println();
        System.out.println("parameterized constructor : (int) " + a);
        System.out.println();
    }
    //    Constructor Overloading
//    public Student(int id, String name, String city) {
//        System.out.println("Creating Object : Parameterized");
//        studentId = id;
//        studentName = name;
//        studentCity = city;
//    }

    // this : keyword
    public Student(int id, String studentName, String studentCity) {
        System.out.println("Creating Object : Parameterized");
        studentId = id;

        // to refer it as, the current object's variable using this keyword. If this is not used the local value (like: studentName) won't reach the object's variable (studentName).
        this.studentName = studentName;
        this.studentCity = studentCity;

        // studentName = studentName;
        // studentCity = studentCity;
    }


    // Member methods (functions)
    public void study() {
        System.out.println(studentName + " is studying");

        // this: keyword
        // this -> refers to the current invoking object.
        System.out.println(this.studentCity);
    }

    // Method Overloading
    public double study(float f){
        System.out.println("Method Overloading " + f);
        return 7.7;
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



// 2. Constructor : Constructor is used to initialize the data of the object.
// Gets called Automatically, when we create constructor.
// Properties of Constructor:
// 1. Name == Class Name
// 2. Constructor does not return any value. Not even void.
// 3. a. Non-Parameterized Constructor e.g. Public Student(){}
//    b. Parameterized Constructor     e.g. Public Student(int a, int b, int c){}
//    c. Default Constructor           : When Java creates automatically.
//                                       If class does not have any constructor then Java creates one default constructor.



// 3. Overloading
    // a. Constructor Overloading
        // At least one must be there for constructor overloading.
        // * Parameters shd not be similar
        // * Number of arguments -> Different
        // * type of argument -> Different
        // * Order of argument -> Different

    // b. Method Overloading
        // Having multiple methods in same class with same name.
        // At least one must be there for method overloading.
        // * Parameters shd not be similar
        // * Number of arguments -> Different
        // * type of argument -> Different
        // * Order of argument -> Different

// 4. this : keyword
// Refers to the current invoking object    e.g.   t.show()     "t" is current invoking object.
// this()
// -> is used for calling current class constructor from inside different constructor of same class.

// 5. Inheritance:
// -> It is the mechanism in Java by which one class is allowed to inherit the features (properties & methods) of another class.
// using "extends" : keyword

// Animal <- Dog
// class Dog extends Animal

// 3 Names:
// Child Class
// Sub Class
// Derived Class

// 3 Names:
// Parent Class
// Super Class
// Base Class

// Types of Inheritance:
// 1. Single Inheritance : 1 p : 1 c
// 2. MultiLevel Inheritance : A (x) <- B (x+y) <- C (x+y+z)
// 3. Hierarchical Inheritance : 1 p : n children
// 4. Multiple Inheritance : n parents : 1 child
        // Multiple Inheritance: is not possible in Java using Classes
        // But can be achieved using Interface.
// 5. Hybrid Inheritance : Combination
// 6. Cyclic Inheritance : loop : A -> A, A -> B -> A : Java does not support this



