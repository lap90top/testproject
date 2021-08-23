package method;

public class MethodWithReturnType {

    // syntax of signature method: access_specifier return_type function or methodName(optional parameter){code}

    // method1 with return type and without input parameter
   public String demo () {
    String name = "Core Java";
    return name;

   }


    // method2 with return type and with one input parameter
    public String message (String msg) {
        String output = "Hello" + msg;
        return output;

    }

    // method3 with return type and without input parameter

    public int demoInt () {
        int a = 33;
        return a;

    }

    // method4 with return type and without input parameter , we can also do this

    public int demoInt1 () {

        return 66;

    }



    public static void main(String[] args) {

        //step1: we will create an object of a class (here our class is student)------- className objectName =new className();
        // step2:object.methodName or functionName();   ---------------------for calling or executing a method through main method.
        MethodWithReturnType object = new MethodWithReturnType();

       String var = object.demo();   //for method1 ,// storing output in var variable
       System.out.println(var);

       String result = object.message("John");  //for method2 ,// storing output in result variable
       System.out.println(result);

       int result_int = object.demoInt();
       System.out.println(result_int);

       int result_int1 = object.demoInt1();
       System.out.println(result_int1);

    }



}
