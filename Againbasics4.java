import java.util.Scanner;
import java.io.IOException;

public class Againbasics4 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        // you cant create object of an abstract class

        // only inner classes can be static

        // interface is for all abstract method class
        // all method in interface is public abstract by default
        // for interfaces we use keyword implements
        // all the variables in interface is by deafult final and static
        // so we need to initalize it
        // a class can implements multiple interfaces
        // an interface can extends other interfaces

        // ENUMERATION -enums
        // we cant extend enum classes

        // types of interfaces
        // normal(2 or more method) , functional(SAM - single abstract method)
        // (single metohd), marker(no method)

        // WE CAN use Lambda expression only with functional interface

        // errors
        // compile time or syntactical error
        // runtime errors or exceptions
        // logical errors or bugs

        // exception handling using try catch
        // "try" block will try to execute the statements
        // if it doesnt throw exceptions it'll work otherwise
        // the rest of the code will work
        // int i=9;
        int i = 0;
        int j = 0;
        try {
            j = 18 / i;
        }
        // to catch the exception if the statements throws error
        // exception here is a class e is its object
        catch (Exception e) {
            System.out.println("Something went worng  : " + e);
        }
        System.out.println("i = " + i + " and j = " + j);


        // exception heirarchy
        // object class -> throwable -> error
        // -> exception


        // throw keyword(when we want to call the exception)
        // we create the object of exception class
        i = 20;
        j = 0;
        try {
            j = 18 / i;
            if (j == 0) {
                throw new Exception("throw");
            }
        } catch (Exception e) {
            System.out.println("Something went worng  : " + e);
        }
        System.out.println("i = " + i + " and j = " + j);


        // prints ascii value
        // imports class and adds throws IOexception
        // System.out.println("enter a number : ");
        // int num = System.in.read();
        // System.out.println(num);


        // we can write try with finally to
        // try{
        // }
        // finally{
        // }

        // OR
        i = 0;
        j = 0;
        try {
            j = 18 / i;
        } catch (Exception e) {
            System.out.println("Something went worng  here : " + e);
        } finally {
            // this statement will excute irrespective
            // if try throws an error or not
            System.out.println("i = " + i + " and j = " + j);

        }


        //we use finally when we want to close the resources
        //using buffereader
        

    }
}
