package inheritance;

public class A extends  B {

  /* // we want to make class A as a child of B (parent)
   // for this we use extends key word------class A extends B
    // it means B is parent of Class A
    // therefore, we will write code in B and due to extends key word( (parent & child relationship)
   // automatically code or method of B  will come in Class A
   // while in class A,Any method is not write

   */

    public static void main(String[] args) {
        // Step 1: create an object of class  --- ClassName Object_Name = new ClassName();
        // step 2: Object_Name.Function or MethodName();  // for calling a method

        A object = new A();
        object.m1();
        object.m2();
    }
}
