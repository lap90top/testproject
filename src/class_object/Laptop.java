package class_object;

public class Laptop {

       //properties of laptop:
        String brand ="Dell";//declaration of properties
        int ram    =8;
        double price =68000.50;
        int hard_drive  =512;


    public static void main(String[] args) {
      //syntax for creating object
      // CLASS_NAME OBJECT_NAME =new CLASS_NAME();
        Laptop object = new Laptop();    //created object1
        System.out.println(object.brand);  //object.property_name
        System.out.println(object.ram);
        System.out.println(object.price);
        System.out.println(object.hard_drive);

        Laptop object1 = new Laptop();    //created object2
        System.out.println(object1.brand);  //object.property_name (if we want to display anything of object
                                              // then we will  write (object.property_name)
        System.out.println(object1.ram);       // note: in java same name variable can not use therefore
                                                 //  we are using object(variable) and object1(variable)
        System.out.println(object1.price);       // so we can create multiple object through a class.
        System.out.println(object1.hard_drive);


    }
}