package array;

public class DemoArray {

    // syntax of signature method: access_specifier return_type function or methodName(optional parameter){code}

    public void demo() {
        // Data type: String
        // syntax of Array: DataType [] variable_name ={,,,,,,,,};
        String[] nameArray = {"Test", "John", "Raj", "Rahul", "Ankit", "Ajay"};
        System.out.println(nameArray[0]);
        System.out.println(nameArray[1]);
        System.out.println(nameArray[2]);
        System.out.println(nameArray[3]);
        System.out.println(nameArray[4]);
        System.out.println(nameArray[5]);

    }


    public void demoStringArray(){
        // Data type: String
        String[] nameArray = {"Test", "John", "Raj", "Rahul", "Ankit", "Ajay"};

        // syntax for normal for_loop: for(int i=0; i<variable_name.length; i++){}
        for (int i = 0; i < nameArray.length; i++) {

            System.out.println("Printing Array :" + nameArray[i] + "Printing index i :" + i);


        }

        // syntax of Advance for loop: for (DataType variable :ArrayName or Array/Collection){}

        for (String var : nameArray){

            System.out.println("Inside nameArray Advance loop :" + var);

        }

    }


        // Data type: int
        public void demoIntArray () {

            // syntax of Array: DataType [] variable_name ={,,,,,,,,};
            // symbol of Array:[]

            int[] marksArray = {24, 36, 60, 70, 40, 30, 20, 10, 45};
            // syntax of Advance for loop: for (DataType variable :ArrayName or Array/Collection){}
            //here ArrayName----marksArray

            for (int var : marksArray) {

                System.out.println("Inside marksArray Advance loop:" + var);


            }
        }



            // Data type: double
    public void demoDoubleArray(){

        double[] prices = {20.50, 10.20, 50.30, 60.40, 80.20};

        for (double var : prices) {

            System.out.println("Printing prices Array :" +var);


        }


    }



        public static void main (String[]args){

            //step1: we will create an object of a class (here our class is student)------- className objectName =new className();
            // step2:object.methodName or functionName();   ---------------------for calling or executing a method through main method.

            DemoArray object = new DemoArray();
            object.demo();
            object.demoStringArray();
            object.demoIntArray();
            object.demoDoubleArray();



        }


}