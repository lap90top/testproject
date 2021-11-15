package inheritance;

public class MethodOverLoading {

   /* // Polymorphism: it is a Greek Word ,and it is made by combination of two Greek Words such as Poly and Morphism
    //Poly----many, Morphism----forms
    // Polymorphism is divided into two parts:Method Overloading and Method Overriding
    // Method Overloading : it is also called Compile Time Polymorphism
    //(because in compile time we(compiler) can find out which method will run or execute)
    // in Method Overloading---------- Method name is same with different parameters in same class
    // in Method Overloading we can create many Methods
    // Method Overriding  :  it is also called Run Time Polymorphism
     */

    // syntax of signature method:access_specifier return_type function or methodName (optional parameter){code}

    public void m1(){

        System.out.println("This is m1 method with out parameter");

    }

    // MethodOverLoading method 1:

    // syntax of signature method:access_specifier return_type function or methodName (optional parameter){code}

    public void m1( int a){

        System.out.println("This is m1 method with one int parameter");

    }

    // MethodOverLoading method 2:

    // syntax of signature method:access_specifier return_type function or methodName (optional parameter){code}

    public void m1( String s){

        System.out.println("This is m1 method with one String parameter");

    }


    // MethodOverLoading method 3:

    // syntax of signature method:access_specifier return_type function or methodName (optional parameter){code}

    public void m1( int a , String s){

        System.out.println("This is m1 method with two parameters int and String");

    }

    // main method : to run program


    public static void main(String[] args) {
        // Step 1: create an object  of class --- ClassName Object_Name = new ClassName();
        // step 2: Object_Name.Function or MethodName();  // for calling a method

        MethodOverLoading object = new MethodOverLoading();
        object.m1();
        object.m1(33);
        object.m1("Java");
        object.m1(33 ,"Java");



    }




}
