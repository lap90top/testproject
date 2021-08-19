package method;

public class Calculator {


  /*  // method of calculator : addition, multiplication,division,subtraction
    // addition = a+b , multiplication = a*b , division = a/b ,subtraction =a-b

   */
    // syntax of signature method: access_specifier return_type function or methodName(optional parameter){code}

 public void addition () {

     int a =20;
     int b =10;
     int sum =a+b;

     System.out.println("SUM of a and b is :"+sum);

 }

    public void multiplication () {

        int a =20;
        int b =10;
        int multi =a*b;

        System.out.println("Multiplication of a and b is :"+multi);

    }



    public void division () {

        int a =20;
        int b =10;
        int div =a/b;

        System.out.println("Division of a and b is :"+div);

    }


    public void subtraction () {

        int a =20;
        int b =10;
        int sub =a-b;

        System.out.println("Subtraction of a and b is :"+sub);

    }




    public static void main(String[] args) {

        //step1: we will create an object of a class (here our class is student)------- className objectName =new className();
        // step2:object.methodName or functionName();   ---------------------for calling or executing a method through main method

        Calculator object = new Calculator();
        object.addition();
        object.multiplication();
        object.division();
        object.subtraction();


    }



}
