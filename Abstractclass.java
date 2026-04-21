import java.util.Scanner;

abstract class base{
    int a;

    abstract void greet();
    abstract void shape();
}

class derived extends base{
    int b;

    void greet(){
        System.out.println("entering the class");
    }

    void shape(){
        System.out.println("entering the class : ");
    }
}

abstract class derived2 extends derived{
    int c;

}

public class Abstractclass {
   

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //IN ABSTRACT CLASS ...either we need to override the abstract method 
        // in inheritance or make the derived class abstract
        
        //Abstract methods requires abstract class

        //we cannot make any object of the abstract class
        
        derived d = new derived();
         

    }
    
}
