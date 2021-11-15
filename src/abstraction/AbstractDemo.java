package abstraction;

public abstract class AbstractDemo {

     /*  // Abstraction: hiding internal information ,it is called abstraction,example : using abstract method
      // Abstract_Method: A method without method body ,it is called Abstract Method
      //Abstract class: A class which have at least one abstract method, it is called Abstract class
      // Interface :All methods of interface will be abstract
      // when we design a big software then we use abstract class and interface according to the requirement
      // Inheritance: parent can override child
      */
    // Syntax for Abstract_Method: access_specifier abstract  return_type  method_name (optional parameter or input parameter);

     // Abstract method
      public abstract void demo(); //  Abstract method 1

      public abstract void m (); //  Abstract method 2


      // Normal method
       public  void m1 (){

           System.out.println("Hello:");
       }



}
