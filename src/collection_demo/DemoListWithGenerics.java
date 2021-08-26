package collection_demo;

import java.util.ArrayList;

public class DemoListWithGenerics {

    // syntax of signature method:access_specifier return_type function or methodName (optional parameter){code}

    public void demo(){
      // Generics: tell us the data type of collection ,symbol of generics---<>
        // syntax of Generics: ArrayList <Data Type> object_name = new ArrayList <Data Type> ();
        // Data Type: String, Integer,Double,Float,Long ,Character .

        ArrayList  <String> listNames = new ArrayList <String> (); // compile time safety it means no problem will come in run time
         listNames.add("Raj");
         listNames.add("Abhay");
         listNames.add("Ajay");
         listNames.add("Anup");

    // Syntax of Advance for loop: for (Data Type variable :Array/Collection){code}
        for (String  var :listNames){

            System.out.println("Printing Name :" + var);
        }


        //  in first symbol <> Data Type will write compulsory but in 2nd symbol<> Data Type will not write compulsory
        ArrayList  <Integer> integerArrayList = new ArrayList <> ();
        integerArrayList.add(33);
        integerArrayList.add(22);
        integerArrayList.add(30);
        integerArrayList.add(40);

        for (Integer var : integerArrayList){

            System.out.println("Printing integerArrayList :" +var);

        }

        ArrayList  <Double> doubleArrayList = new ArrayList <> ();
        doubleArrayList.add(30.50);
        doubleArrayList.add(40.20);
        doubleArrayList.add(70.50);
        doubleArrayList.add(100.50);


        for (Double var : doubleArrayList){

            System.out.println("Printing doubleArrayList :" +var);

        }





    }

 // main method : to run program

    public static void main(String[] args) {
       // Step 1: create an object --- ClassName Object_Name = new ClassName();
       // step 2: Object.Function or MethodName();  // for calling a method
        DemoListWithGenerics object = new DemoListWithGenerics();
        object.demo();



    }


}
