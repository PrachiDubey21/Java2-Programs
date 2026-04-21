import java.util.Scanner;


class A {

    int a;

    A(){
        System.out.println("IN A ");
    }

     A(int n){
        System.out.println("IN A int");
    }

}
class B extends A{

     B(){
        //this is here default
        super();
       // super(4);
        System.out.println("IN B ");
    }

    
     B(int n){
        //this will execute the default constructor of same class
       // this();
        System.out.println("IN B int");
    }


    B(int n , int x){
        super(x);
        System.out.println("IN B int");
    }

}

class C{
    void show(){
        System.out.println("in C show");
    }
}

class D extends C{
     void show(){
        System.out.println("in D show");
    }
}

public class Againbasics2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //by creating static data memeber in class
        //it will be common to all the objects created in the class
        //static int n;
        //we can acess it by objectname.n and classname.n as well

        //for static method
        //we can acess it by  classname.functionname
        //inside static method we can only acces static variable Directly
        //but if we want to use instance variable we can pass it as a parameter and 
        //then inside function we can use it as obj.member
        //WE DONT NEED OBJECT TO CALL STATIC METHOD

        //we can create a static block whivch is just like a constructor 
        //but it will get called only once no matter how many object gets created
        //example is   
        //             static{
        //                   datamemeber = value;
        //                 }

        //naming convection
        //camel casing
        //classes and interfaces - firstletter capital
        //variable and methods - all small
        //constant - all big
        //showMyMarks (try not to use underscore)
        //constructor - firstletter capital

        
        //learn about anonymous object(you cant use it but the object
        // can be created but construtor will be called)
        
        //we write extends baseclassname for inheritance
        //multiple inheritance doesnt work in java due to ambiguity problem

        //derived class object will always automatically call
        //the default constructor of base class then itself's constructor


        //Super and this method
        /* 
        B obj = new B();
        System.out.println();
        B obj1 = new B(20);
         System.out.println();
        B obj2 = new B(10 ,11);
         System.out.println();
         */


         //method overriding
         /* 
         C obj = new C();
        D obj1 = new D();

        obj.show();
        obj1.show();

        C obj2 = new D();
        obj2.show();
        */
      //  D obj3 = new C(); not available

      //to access file from packages
      //we use import packagename.filename;
      // import packagename.*; (to access all the files at once)

      







        










        
    



    }

    
}
