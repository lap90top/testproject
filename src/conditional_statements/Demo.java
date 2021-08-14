package conditional_statements;

public class Demo {

    // ConditionalStatements :if condition and else condition
    // (if condition is true then code of if condition will execute and
    // if condition is false then code of else condition will execute)

    // syntax of if condition and else condition:
    /*  if (condition)
    {
         //code
     }
      else {
      //code
      }
      */

    // Conditions:a=2,b=4
    //a>b-----------FALSE
    //a<b-----------TRUE
    //a==b(comparison)----------FALSE
    //5<10----------TRUE
    //5>2------------TRUE


    public static void main(String args[]) {


        // syntax of variable:
        //Data type variable_name = value;

        // number value( int is used for number value because java can understand int)
        int age = 21;

        if (age > 10)
        {
            System.out.println("Person is young");
        }
        else
        {
            System.out.println("Person is child");
        }


        if (age > 23)
        {
            System.out.println("Person is young");
        }
        else
        {
            System.out.println("Person is child");
        }


      // decimal value( double is used for decimal value because java can understand double)
        double price = 250.60;
        if (price > 250.00)
        {
            System.out.println("product is costly");
        }
        else
        {
            System.out.println("product is not costly");
        }


        if (price > 260.30)
        {
            System.out.println("product is costly");
        }
        else
        {
            System.out.println("product is not costly");
        }


        if (price >= 250.60)
        {
            System.out.println("product is costly");
        } else
        {
            System.out.println("product is not costly");
        }

        // character value ( String is used for character value because java can understand  String)

        String city = "PUNE";
        if (city == "PUNE")
        {
            System.out.println("You are in PUNE");
        } else
        {
            System.out.println("You are not in PUNE");
        }



        if (city =="Delhi")
        {
            System.out.println("You are in PUNE");
        } else
        {
            System.out.println("You are not in PUNE");
        }



    }
}