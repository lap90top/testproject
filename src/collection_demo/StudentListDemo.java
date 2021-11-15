package collection_demo;

import model.Student;

import java.util.ArrayList;

public class StudentListDemo {

// syntax of signature method:access_specifier return_type function or methodName (optional parameter){code}
  public void demo(){

      // syntax of Generics: ArrayList <Data Type> object_name = new ArrayList <Data Type> ();

      ArrayList <Student> studentArrayList = new ArrayList<>();

      // create student object by using parameterized constructor

      // className objectName = new ClassName(); //className---Student

      Student Student1 = new Student("Ajay" ,26 ,"IT");  // object1----Student1

      studentArrayList.add(Student1); // add student1 object in list


      Student Student2 = new Student("Abhay" ,24 ,"CS");  // object2----Student2

      studentArrayList.add(Student2); // add student2 object in list


      Student Student3 = new Student("Abhay" ,24 ,"CS");  // object3----Student3

      studentArrayList.add(Student3); // add student3 object in list

      // Syntax of Advance for loop: for (Data Type variable :Array/Collection){code}

      for (Student var : studentArrayList){

          System.out.println(var.getName());
          System.out.println(var.getAge());
          System.out.println(var.getSection());


      }


  }


    public static void main(String[] args) {

        // Step 1: create an object --- ClassName Object_Name = new ClassName();
        // step 2: Object.Function or MethodName();  // for calling a method

        StudentListDemo object = new StudentListDemo();
        object.demo();


    }


}
