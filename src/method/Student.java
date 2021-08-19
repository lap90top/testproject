package method;

public class Student {



   /* // data member is called as Properties
    // Properties of Student: name,age,roll_no.
    // declaration of properties: String,int,int

    */
    String name;
    int age;
    int roll_no;

    /* // MEMBER FUNCTION OR METHOD IS CALLED AS CAPABILITIES.
          //read,write,eat,play

     */

    // syntax of signature method: access_specifier return_type function or methodName(optional parameter){}

    public void read () {

        System.out.println("This is read method.....");

    }

    public void write () {

        System.out.println("This is write method.....");

    }

    public void play () {

        System.out.println("This is play method.....");

    }

    public void eat () {

        System.out.println("This is eat method.....");

    }



    public static void main(String[] args) {

        //step1: we will create an object of a class (here our class is student)------- className objectName =new className();
        // step2:object.methodName or functionName();   ---------------------for calling or executing a method through main method

        Student object = new Student();
        object.read();    //for calling or executing a method through main method
        object.write();
        object.play();
        object.eat();

    }


}
