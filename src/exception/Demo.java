package exception;

public class Demo {

  /*  // Exception handling:in our java two things are:- Errors and Exception ----stop execution or run of program
    // it means when error will available in program then it will stop the execution of program
    // similarly when exception will available in program then it will also stop the execution of program
    // after this program will not execute
    // Error can not be handled but Exception can be handled
    // Exception can be handled by different methods ,it is called Exception handling
    //we can handle Exception through try & catch method
    // finally block---it will always execute whenever exception will available or not

    //try {
          code
          }

       catch (exception e) {}
       // catch (object of exception   ) {}

       // for one try at least one catch is compulsory and also may be more than one
    */


    // syntax of signature method:access_specifier return_type function or methodName (optional parameter/input parameters){code}
    // normal or simple method:

    public void divide(int a, int b) {

        int result = a / b;

        System.out.println("Result :" + result);

    }

    // use Exception concept: // we can handle this problem through try & catch method after this our program will not stop

    public void divide1(int a, int b) {

        int result =0;
       try {
           result = a / b;
       }
       catch(Exception e) {
           System.out.println("Exception occurred but handled :"+e);
       }

       finally{
           System.out.println("This is finally block and it will be executed every time :");

       }
        System.out.println("Result :" + result);

    }

   // how to throw exception:

    public  void throwException () throws Exception {
     throw  new Exception();// we write throw with new keyword and to make an object of an Exception class

    }



        // main method : to run program
        public static void main (String[]args) throws Exception {
            // step 1: to create an object of a class ------classname object_name = new classname();
            //step 2: object.method_name(); // calling a method

            Demo object = new Demo();
            object.divide(8, 2);

            object.divide1(8, 2);

          try {
              object.throwException();
          } catch (Exception e){

             System.out.println(e);
          }
                                        // after running the program it will show on the console
                                             // Exception in thread "main" java.lang.ArithmeticException: / by zero
                                            //at exception.Demo.divide1(Demo.java:38)
                                            // at exception.Demo.main(Demo.java:56)
                                           // it means our code is not running and the process is stopped
                                           // and there is not any compilation error,but it found exception at run time
                                          // because we divided 8 by 0,and it will give infinite
                                       // we can handle this problem through try & catch method after this our program will not stop
    }
}