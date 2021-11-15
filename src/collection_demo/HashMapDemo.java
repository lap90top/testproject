package collection_demo;

import java.util.HashMap;

public class HashMapDemo {

    // syntax of signature method: access_specifier return_type method_name (parameter){code}
    public void demo (){

     // syntax of HASHMAP: HashMap <Datatype_key ,Datatype_value> object_name = new HashMap <>();
        HashMap <Integer,String> hashMap = new HashMap<>();

     // put(key,value) method: for adding element
        hashMap.put(1 ,"java");
        hashMap.put(2 ,"Spring");
        hashMap.put(3 ,"Spring Boot");

      // get(key)method: for finding value through key
        System.out.println(hashMap.get(1));
        System.out.println(hashMap.get(2));
        System.out.println(hashMap.get(3));

        HashMap <String,String> stringHashMap  = new HashMap<>();
        stringHashMap.put("A", "Delhi");
        stringHashMap.put("B", "Pune");
        stringHashMap.put("C", "Agra");

       System.out.println(stringHashMap.get("A"));
       System.out.println(stringHashMap.get("B"));
       System.out.println(stringHashMap.get("C"));

    }


    public static void main(String[] args) {

        // step 1: to create an object of a class ------classname object_name = new classname();
        //step 2: object.method_name(); // calling a method

        HashMapDemo object = new HashMapDemo();
        object.demo();

    }


}
