package mypackage;

public class Loop {

    public static void main(String args[]) {

        //syntax for loop :
        //for (variable declaration ;condition ; increment/decrement) {code}
        //Increment Loop:
        for (int i = 0; i < 10; i++) {

            System.out.println("Hello :" + i);

        }

        //Decrement  Loop:i--;(it is used for decrement)

        //syntax for loop :
        //for (variable declaration ;condition ; increment/decrement) {code}

        for (int i = 10; i > 0; i--) {
            System.out.println("Hello :" + i);


        }


        // printing the table of 2 (question)-----2x1,2x2,2x3,2x4,2x5,2x6,2x7,2x8,2x9,2x10
        //syntax for loop :
        //for(variable declaration ;condition ; increment/decrement){code}
        //Increment Loop:
        for (int i = 1; i <= 10; i++) {

            //  Syntax of variable:
            //Data type variable_name= value;
            int two = 2;
            int output = two * i;
            System.out.println(output);

        }

        // printing the table of 5 (question)-----5x1,5x2,5x3,5x4,5x5,5x6,5x7,5x8,5x9,5x10
        //syntax for loop :
        //for(variable declaration ;condition ; increment/decrement){code}
        //Increment Loop: i++; (it is used for increment)

        for (int i=1; i<=10 ;i++) {

            //  Syntax of variable:
            //Data type variable_name= value;
            int five = 5;
            int output = five*i;
            System.out.println(output);

        }

        // syntax for While Loop:
        //while ( condition ) {code}

        int i =0;
        while (i<10){
            System.out.println("Inside While loop Hello :" +i);
            i++;
        }




    }
}