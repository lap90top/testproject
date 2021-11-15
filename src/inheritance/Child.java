package inheritance;

public class Child extends Parent {

    // Method Overriding:same method but different method body in child class
    // syntax of signature method:access_specifier return_type function or methodName (optional parameter){code}

    public void m1(){
       System.out.println(" I am in M1 of CHILD class");
        System.out.println(" I am in M1 of CHILD class");
    }

    public static void main(String[] args) {
        // Step 1: create an object  of class --- ClassName Object_Name = new ClassName();
        // step 2: Object_Name.Function or MethodName();  // for calling a method

        Child obj = new Child();       // then which object will create with new key word that method will execute
        obj.m1();                       // here child method will execute


        Parent object = new Parent();       // then which object will create with new key word that method will execute
        object.m1();                          // here parent method will execute


        Parent object1 = new Child();  // then which object will create with new key word that method will execute
        object1.m1();                     // here child method will execute


    }

}
