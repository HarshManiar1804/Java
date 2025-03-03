// import java.lang.reflect.Array;
// import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void prindJava(){
        System.out.println("Hello Java");
    }
    public static void main(String[] args) throws Exception {
        // comments in Java 

        // print in Java
        // ---------------------
        // System.out.println("Hello, World!");

        // variable in Java
        // ---------------------

        // String name ="harsh";
        // int age = 18;
        // System.out.println(name);
        // System.out.println(age);


        // types in Java ( primitive , non-primitive)
        // ---------------------
        // Primitive types 
            // byte -1 [-128 to 127]
                // byte age = 30;

            // short - 2 123
            // int - 4 123
                // int phone = 1234567890;

            // long - 8 123457890
                // long phone1 = 12345678900L;

            // float - 4 3.14
            // double - 8 
                // float PI = 3.14F;
            // char - 2 [a,b,c,d]
                // char letter = 'a';
            // boolean - 1 { true,false}
                // boolean isAdult = true;
// -----------------------------------------------------------------------

         // Non-Primitive types 
            // String  ( strings are immutable is Java)
            // String name = new String("Harsh"); // new keyword is not compulsory in String
                // length of string
                // System.out.println(name.length());
                // concat of string
                // String name = "harsh";
                // String surname = "maniar";
                // System.out.println("concatenate of both string is " +  name +" "+ surname);
        
            // arrays

            // int[] marks = new int[3]; // array of marks which contains 10 values
            // marks[0]=99;
            // marks[1]=98;
            // marks[2]=97;
            // System.out.println(marks[8]);

            // length of an array 
            // System.out.println("length of marks array is :- " + marks.length);
            //-----------------------------
            // sorting the array
            // System.out.println(marks[0]);
            // Arrays.sort(marks);
            // System.out.println(marks[0]);

            //-----------------------------

            // 2d arrays
            // int [][] matrix = new int[3][3]; // here the dimension is required while intializing
// -----------------------------------------------------------------------
            //casting ( type casting) (compatible type will only be converted)

            //implicite casting
            // double price = 100.00;
            // double GST = 18;
            // System.out.println("final price after GST: " + (price+ GST));

            // explicite casting

            // int price = 100;
            // int GST = (int)18.0; // write type in which you want to convert the value 
            // System.out.println("final price after GST: " + (price+ GST));


// -----------------------------------------------------------------------
            // constants (value will not be change of that perticular variable)
            // final float PI = 3.14F;
            // PI = 12;
// -----------------------------------------------------------------------
            // Maths
            // int num1 = 5,num2=3;
            // max and min
            // System.out.println("max is "+ Math.max(num1, num2));
            // System.out.println("min is "+ Math.min(num1, num2));
            // // random ( range always between 0 to 1)
            // System.out.println("random value is " + (int)(Math.random()*100));
// -----------------------------------------------------------------------

        // How to take input in Java
        // Scanner sc = new Scanner(System.in);
        // // System.out.print("Type your age: ");
        // // int age = sc.nextInt();
        // // System.out.println("Your age is "+ age);

        // // input strings
        // System.out.print("Enter your Name: ");
        // String name = sc.nextLine();
        // System.out.println("Your name is "+ name);
// -----------------------------------------------------------------------
        // conditional statements
        // boolean isAdult = true;
        // if(isAdult){
        //     System.out.println("You are adult");
        // }else{
        //     System.out.println("You are not an adult");
        // }
// -----------------------------------------------------------------------
        // loops 
        // for loop
        // for(int i=0;i<10;i++){
        //     System.out.println("worker "+ (i+1));
        // }

        // while loop
        // int j=5;
        // while(j>=1){
        //     System.out.println("worker " + j);
        //     j--;
        // }

// -----------------------------------------------------------------------
        // Exception handling ( TRY - CATCH )
        // int[] marks = {1,2,3};
        // try{
        //     System.out.println("marks"+ marks[6]);
        // }
        // catch(Exception exception){
            
        // }
        // System.out.println("next line");   
// -----------------------------------------------------------------------

        // function
        // prindJava();
        // prindJava();
        // prindJava();
    }
}
