import java.util.Scanner;

class Base {
    int id;
    String name;

    Base(){
        System.out.println("hooiihihihihhahaha");
    }

     Base(int a){
        System.out.println("argument");
    }

    void func1(){
        System.out.println("THIS IS BASE CLASS");
    }

    void setId(int n){
        this.id=n;
    }

    void setName(String s){
        this.name=s;
    }

    int getId(){
        return id;
    }

    String getName(){
        return name;
    }

}

class derived extends Base{

    derived(){
        // super(0); //for argument constructor
        System.out.println("derived");
    }

    private int number;
    
    void setNumber(int m){
        this.number=m;
    }
    int getNumber(){
        return number;
    }

    void func1(){
        System.out.println("THIS IS DERIVED CLASS");
    }

}

public class Inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      // derived d1 = new derived();
      //  d1.setName("helu");
      //  System.out.println(d1.getName());

      //Base b1 = new Base();
      //  b1.func1();
      //  d1.func1();


        derived d2 = new derived();


        
        

         


    }

}
