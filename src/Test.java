public class Test {

    public static void main(String[] args){         // C-Style Array declaration
        System.out.print("Hello World!!  ");
        System.out.println("Hello World");


        int a = 27;
        System.out.println(a);

        a = 77;
        System.out.println(a);

//        Type casting
//          1. Implicit Type Casting
        int i = 50;

        System.out.println(i);
        System.out.println((double) i);

//          2. Explicit Type Casting
        double my_double = 37.77;
        int my_int = (int)my_double;

        System.out.println(my_double);
        System.out.println(my_int);


    }

}

class Student {
    public static void main(String[] args){         // Java-Style Array declaration
        System.out.println("This is a Student Class");
    }
}


// 1. Keyword - class
// 2. Identifier - Test, Student etc...
// 3. Main Function - JVM identifies only this function as Starting point

// 4. Variables
    // data_type variable_name;    // Declare
    // variable_name - value;      // Initialization, "=" Assignment operator

    // data_type variable_name = value;    // Declare & initialize

    // ✨Value of variables can vary/changed.

// 5. Data Types
    // 2 Types:
    // 1. Primitive Data Types
    // 2. Non-Primitive Data Types/ Reference Data Types/ User Defined Data Types

    // 1. Primitive Data Types

    // inbuilt with languages
    // 8 types:

    // boolean - 1 bit
    // byte  - 8 bits (0/1 combination)
    // char -- 16 bits

    // short - 16 bits
    // int  - 32 bits
    // long - 64 bits

    // float - point - 32 bits - upto 7 decimal digits
    // double - point - 64 bits - upto 16 decimal digits

    // 2. Non-Primitive Data Types/ Reference Data Types/ User Defined Data Types
        // Created by user

// 6. Type Conversion/ Type Casting in Java
    //  2 types:

    // 1. Automatically by JVM -> Implicit Type Casting, When there will be "NO" Data loss in value, JVM does the conversion.
    // 2. Forcefully by Programmer -> Explicit Type Casting/ Conversion, When there will be loss in value, Conversion is done "FORCEFULLY".

// 7. Operators: in Java is a symbol that is used to "perform operations".
    // a+b:
    // a,b : Operands
    // + : Operator

    // 1. Unary : expr++, expr--, ++expr, --expr, +expr, -expr, ~, ! : [postfix, prefix]
    // 2. Arithmetic : *, /, %, +, -  : [multiplicative, additive]
    // 3. Shift
    // 4. Relational : <, >, <=, >=, instanceof, ==, != : [comparison, equality]
    // 5. Bitwise : &, ^, | : [bitwise AND, bitwise exclusive OR, bitwise inclusive OR]
    // 6. Logical : &&, || : [logical AND, logical OR]
    // 7. Ternary :    ? :         eg:  expression ? value1 (if true): value2 (if false)
    // 8. Assignment : =, +=, -=, *=, /=, %=, &=, ^=, |=, <<=, >>=, >>>=




