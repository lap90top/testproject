package conditional_statements;

public class Demo1 {

    public static void main(String[] args) {

        // Logical operator: AND Operator ,OR Operator and NOT Operator
        // in java we denote AND Operator,OR Operator and NOT Operator through these symbol (&&),(||) and (!)


        // AND Operator-----&&
        // a&&b-------------   a=true ,b=true ======>true
        // a&&b -------------   a=false ,b=true ======>false


        // OR Operator -----||
        // a||b--------------a=true ,b=true ==>true
        // a||b--------------a=false ,b=true==>true
        // a||b--------------a=false,b=false==>false

        // NOT Operator-----!
        // !a --------------a=true==>false
        // !a --------------a=false==>true

        // syntax of variable:
        // Datatype  variable_name =value;

         int age = 15;
         String city = "AGRA";

        // syntax of if condition and  else condition:
        /* if (condition)
            {
              //code
             }
           else
           {
             //code
            }
             */

        // AND Operator-----&&

       if (age>10 && city=="AGRA")
       {
           System.out.println("This person is young and live in AGRA city");

        }
        else
       {
           System.out.println("This person is not young and not live in AGRA city");
       }


        // OR Operator -----||

        if (age>10 || city=="DELHI")
        {
            System.out.println("This person is young and live in AGRA city");

        }
        else
        {
            System.out.println("This person is not young and not live in AGRA city");
        }


        if (age>15 || city=="DELHI")
        {
            System.out.println("This person is more than 15 and not live in AGRA city");

        }
        else
        {
            System.out.println("inside else block of OR Operator");
        }



        // NOT Operator-----!

        if (!(age<10))
        {
            System.out.println("inside if block of NOT Operator");

        }
        else
        {
            System.out.println("inside else block of NOT Operator");
        }




    }



     }
