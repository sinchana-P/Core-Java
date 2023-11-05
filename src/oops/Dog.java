package oops;

public class Dog extends Animal{

    public Dog(){
        // this super() must be the first line/statement of the constructor.
        super();
        System.out.println("Dog Constructor");
    }

    int x=12;

    // super keyword
    public void getX(){
        System.out.println(super.x);
        System.out.println(x);
        System.out.println(this.x);

        //        4
        //        12
        //        12
    }
}
