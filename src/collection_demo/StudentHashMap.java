package collection_demo;

import model.Student;

import java.util.HashMap;

public class StudentHashMap {

      // syntax of signature method: access_specifier return_type method_name (parameter){code}
    public void demo (){

        // syntax of HASHMAP: HashMap <Datatype_key ,Datatype_value> object_name = new HashMap <>();
        HashMap<Integer, Student> studentHashMap  = new HashMap<>();
        // Student is a model class ,and we will make an object of Student class through parameterized constructor
        //classname object_ame = new classname ();------------create an object of Student model class
        Student student1 = new Student("java",24,"IT");
        Student student2 = new Student("Spring",26,"CS");
        Student student3 = new Student("Spring Boot",28,"EC");

        // put(key,value) method: for adding element

        studentHashMap.put(1 ,student1);
        studentHashMap.put(2 ,student2);
        studentHashMap.put(3 ,student3);

        // get(key)method: for finding value through key

        Student student =studentHashMap.get(1); // for storing we need student type variable
        System.out.println(student.getName()); // used getter method to get name,age,section
        System.out.println(student.getAge());
        System.out.println(student.getSection());

         student = studentHashMap.get(2);      // we can reuse variable of student ,there is no need to make it again
        System.out.println(student.getName()); // used getter method to get name,age,section
        System.out.println(student.getAge());
        System.out.println(student.getSection());

        student = studentHashMap.get(3);
        System.out.println(student.getName()); // used getter method to get name,age,section
        System.out.println(student.getAge());
        System.out.println(student.getSection());




    }

       public static void main(String[] args) {

        // step 1: to create an object of a class ------classname object_name = new classname();
        //step 2: object.method_name(); // calling a method

           StudentHashMap object = new StudentHashMap ();
           object.demo();

    }


}
