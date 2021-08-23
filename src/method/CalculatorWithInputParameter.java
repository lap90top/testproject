package method;

public class CalculatorWithInputParameter {


  /*  // method of calculator : addition, multiplication,division,subtraction
    // addition = a+b , multiplication = a*b , division = a/b ,subtraction =a-b

   */
    // syntax of signature method: access_specifier return_type function or methodName(optional parameter){code}




    //method1
   public void addition (int a , int b){

       int result = a+b;

       System .out.println("sum of and b is :"+result);


   }
    //method2
    public void multiplication (int a , int b){

        int result = a*b;

        System .out.println(" multiplication of and b is :"+result);


    }

    //method3

    public void division (int a , int b){

        int result = a/b;

        System .out.println(" division of and b is :"+result);


    }

    //method4
    public void subtraction (int a , int b){

        int result = a-b;

        System .out.println(" subtraction of and b is :"+result);


    }


     // main method to run program

    public static void main(String[] args) {

        //step1: we will create an object of a class (here our class is student)------- className objectName =new className();
        // step2:object.methodName or functionName();   ---------------------for calling or executing a method through main method.

        CalculatorWithInputParameter object = new CalculatorWithInputParameter();
        object.addition(10, 5);
        object.multiplication(3,2);
        object.division(10,2);
        object.subtraction(20,10);


    }






}
