package abstraction;

public class Child extends AbstractDemo {

    // whenever we make an abstract class as a parent then child's responsibility to write the code (override)of abstract method


    @Override
    public void demo() {

      System.out.println("Method demo is overridden :"); // logic


    }

    @Override
    public void m() {
        System.out.println("Method m is overridden");
    }

    // main method : to run program

    public static void main(String[] args) {

        // step 1: to create an object of a class ------classname object_name = new classname();
        //step 2: object.method_name(); // calling a method

        Child object = new Child();
        object.demo();
        object.m1();
        object.m();




    }

}
