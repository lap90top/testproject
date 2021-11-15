package inheritance;

public class B {

    /* // inheritance :it is very important concept in java and more purpose or more things can achieve through this in java
    // it is a relationship(parent & child) between two classes  in which it shares data or method from each other
    // and this process is called as an inheritance
    // in which a relation creates between two classes and this relation contains parent & child.
    // class A(Parent)-----------Relationship------class B (child)
    // how to make it---- class A(child) extends class B (parent) ---- it will create through extends keyword.
    */

    // syntax of signature method:access_specifier return_type function or methodName (optional parameter){code}

    // Method 1:
    public void m1 (){

        System.out.println("I am in M1 of class B");
    }

    // Method 2:
    public void m2 (){

        System.out.println("I am in M2 of class B");
    }


    // main method : to run program----- public static void main(String[] args) {code}

    public static void main(String[] args) {

        // Step 1: create an object  of class --- ClassName Object_Name = new ClassName();
        // step 2: Object_Name.Function or MethodName();  // for calling a method

        B object = new B ();
        object.m1();
        object.m2();

    }






}
