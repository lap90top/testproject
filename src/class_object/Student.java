package class_object;

public class Student {

    // properties of Student: name,age,roll no.
    // declaration of properties:
    String name;
    int age;
    int roll_no;


    // parameterized constructor (it is used for making multiple object through a class)

    public Student(String name, int age, int roll_no) {
        this.name = name;
        this.age = age;
        this.roll_no = roll_no;
    }


   // Main method to run program:-
   public static void main(String[] args) {

   //step1: we will create an object of a class (here our class is student)------- className objectName =new className();

       Student object1 = new Student("Abhay", 26,4590);
       System.out.println(object1.name);  //object.property_name
       System.out.println(object1.age);
       System.out.println(object1.roll_no);

       Student object2 = new Student("Devansh",5,9 );
       System.out.println(object2.name);  //object.property_name
       System.out.println(object2.age);
       System.out.println(object2.roll_no);

       Student object3 = new Student("Preeti",20,15 );
       System.out.println(object3.name);  //object.property_name
       System.out.println(object3.age);
       System.out.println(object3.roll_no);


   }



}
