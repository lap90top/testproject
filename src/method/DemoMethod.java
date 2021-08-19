package method;

public class DemoMethod {

  /* // syntax of signature method: access_specifier return_type function or methodName (optional parameter){}
   // to make function or method we use syntax of signature method

   */

  public void demo () {

     System.out.println("This is Demo Method.......");


  }

  /*  // to run program or function/method we use main method
    // public static void main(String[] args) {}

   */

    // MAIN METHOD
    public static void main(String[] args) {


        //step1: we will create an object of a class (here our class is student)------- className objectName =new className();
        //step2:object.methodName or functionName();   ---------------------for calling or executing a method through main method

        DemoMethod object  = new DemoMethod();
        object.demo();  //for calling or executing a method through main method

    }







}
