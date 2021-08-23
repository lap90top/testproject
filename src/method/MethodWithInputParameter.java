package method;

public class MethodWithInputParameter {

// syntax of signature method of core java: access_specifier return_type function or methodName(optional parameter){code}
// we can pass parameter as a variable: (Datatype variable_name)-------(String name)

    //method1 :without input parameter
    public void message(){

       System.out.println("Hello");

    }

    // method2 with one input parameter
    public void message1(String name){
        System.out.println(name);
        System.out.println("Welcome:"+name);

    }


    //method3 with two input parameter

    public  void twoinputparameters(String name ,int age){
        System.out.println("Name is :"+name +"Age is :"+age);

    }


    public static void main(String[] args) {

       //step1: we will create an object of a class (here our class is student)------- className objectName =new className();
        // step2:object.methodName or functionName();   ---------------------for calling or executing a method through main method.

        MethodWithInputParameter object = new MethodWithInputParameter();
        object.message();
        object.message1("Java");
        object.twoinputparameters("Raj" ,25);

    }




}
