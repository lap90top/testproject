package array;

import java.util.Arrays;

public class SecondHighestNumberInArray {

    public static void main(String args[]) {

        int[] array = {11, 55, 2, 56, 55, 77, 65, 66};  // An array that holds the numbers


        //method 1:

        Arrays.sort(array);

        System.out.println("First highest element in array:" + array[array.length - 1]);
        System.out.println("Second-highest element in array:" + array[array.length - 2]);
        System.out.println("Third-highest element in array:" + array[array.length - 3]);
        System.out.println("Fourth-highest element in array:" + array[array.length - 4]);


        //method 2:using for loop

        // create 2 variables to hold largest and second-largest values
        int largest = 0;
        int secondLargest = 0;


        // syntax for normal loop  or for loop: for(int i=0;i<variable_name.length;i++){code}
        for (int i = 0; i < array.length; i++) {

            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];

            } else if (array[i] > secondLargest) {

                secondLargest = array[i];

            }
        }
// print out the array and second-largest number
           System.out.println(Arrays.toString(array));
           System.out.println("First highest element in array:" + largest);
           System.out.println("Second-highest number in array:" +secondLargest);




    }

}












 /*  note: method 1 :  // 11,55,2,56,55,77,65,77,66

//sorting of numbers= A TO Z   = 2,11,55,56,65,66,77

// array.length-1 = first highest element in array

// array.length-2 =  second-highest element in array

// array.length-3 =  third-highest element in array




    public class SecondClassLargestNumberInArray{

//main method

        public static void main(String args[]){


//syntax of array: DataType [] Variable_name ={,,,,,,,,,,,};

            int [] array ={11,55,2,56,55,77,65,77,66};

//sorting of numbers= A TO Z   = 2,11,55,56,65,66,77

            Arrays.sort(array);

// for printing=System.out.println();


            System.out.println("First highest element in array:"+array[array.length-1]);
            System.out.println("Second-highest element in array:"+array[array.length-2]);
            System.out.println("Third-highest element in array:"+array[array.length-3]);


        }

    }

*/


