package method;

public class CalculatorWithReturnType {

    /*  // method of calculator : addition, multiplication,division,subtraction
    // addition = a+b , multiplication = a*b , division = a/b ,subtraction =a-b
    // return type :when return type is given such as int (public int addition) then output will also return (return result) and
     at the time of calling output will store in a variable (int output_add) here int output_add is a variable
   */
    // syntax of signature method: access_specifier return_type function or methodName(optional parameter){code}

   //ADD METHOD WITH TWO INPUT PARAMETER
    public int addition (int a,int b){
        int result =a+b;
        return result;

    }


    //MULTIPLICATION METHOD WITH TWO INPUT PARAMETER
    public int multiplication (int a,int b){
        int result =a*b;
        return result;

    }

    //DIVISION METHOD WITH TWO INPUT PARAMETER
    public int division (int a,int b){
        int result =a/b;
        return result;

    }


    //SUBTRACTION METHOD WITH TWO INPUT PARAMETER
    public int subtraction (int a,int b){
        int result =a-b;
        return result;

    }




    public static void main(String[] args) {
        //step1: we will create an object of a class (here our class is student)------- className objectName =new className();
        // step2:object.methodName or functionName();   ---------------------for calling or executing a method through main method.

        CalculatorWithReturnType object = new CalculatorWithReturnType();

        int output_add =object.addition(2,3);  // storing output in output_add variable
        System.out.println( "Addition of a and b is :" +output_add);


        int output_multi = object.multiplication(5 ,3); // storing output in output_multi variable
        System.out.print("Multiplication of a and b is :"+output_multi);


        int output_div = object.division(10 ,2);  // storing output in output_div variable
        System.out.println("Division of a and b is :" +output_div);



        int output_sub =  object.subtraction( 40 ,20); // storing output in output_sub variable
        System.out.println("Subtraction of a and b is :" +output_sub);





    }


}
