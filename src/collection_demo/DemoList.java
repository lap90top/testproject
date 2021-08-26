package collection_demo;

import java.util.ArrayList;
import java.util.List;

public class DemoList {

// syntax of signature method:access_specifier return_type function or methodName (optional parameter){code}

    public void demo() {

        // Method---add(object),remove(index),get(index)
        // ArrayList is a class,when we will create an object of class then we can add data in it.
        // ArrayList is already a class in java where these methods such as add,remove,get have written only we can use it.
        // List----parent class, ArrayList-------child class, it means in parent class ,child class will be included.

        //add method:
        //syntax of list :ArrayList or List  object_name = new ArrayList();  // without Data type

        List list = new ArrayList();
        list.add("Rahul");  //0 index         // here we are taking data in String form ( "Rahul","Raj","Ajay")
        list.add("Raj");    //1 index
        list.add("Ajay");   //2 index


        //get method : it is used for obtaining a particular data from the list
        System.out.println("Printing element using get :" + list.get(0));
        System.out.println("Printing element using get :" + list.get(1));
        System.out.println("Printing element using get :" + list.get(2));


        //Advance for loop: it is used for printing the data value (Rahul, Raj,Ajay).
        // syntax of Advance for loop:for(DataType variable : ArrayName or Array/Collection){code}
        // here we are taking an Object as a DataType because an Object is a parent class
        // in which we can put everything such as String,list etc.
        // variable (var) ------this contains value of list (in which name of list will come one by one)

        for (Object var : list) {
            System.out.println(var);
        }

        // remove method:
        list.remove(0);

        // syntax of Advance for loop:for(DataType variable : ArrayName or Array/Collection){code}
        for (Object var : list) {
            System.out.println("after delete :" + var);
        }




    }

    public static void main(String[] args) {

        //step1: we will create an object of a class (here our class is student)------- className objectName =new className();
        // step2:object.methodName or functionName();   ---------------------for calling or executing a method through main method

        DemoList object = new DemoList();
        object.demo();


    }




}