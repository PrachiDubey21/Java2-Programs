import java.util.Scanner;

//you can only create 1 PUBLIC CLASS per program

class custom {

    // Attributes , Properties
    private int id;
    private int age;
    private String name;

    // Methods , Behaviour

    custom() {
        age = 20;
    }
     custom(int l) {
        age = l;
    }

    void greet() {
        System.out.println("helloooo hehehh");
    }

    void setage(int a){
        this.age = a;
    }

    int getage(){
        return age;
    }

    void setter(int n, String m) {
        this.id = n;
        this.name = m;
    }

    int getid() {
        return id;
    }

    String getname() {
        return name;
    }

}

public class constructor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        custom objc = new custom();
        custom objc1 = new custom(18);

        objc.setter(1088, "prachi");
        System.out.println(objc.getid());
        System.out.println(objc.getname());
        System.out.println(objc.getage());

        objc.greet();

        objc1.setter(1090, "ADITI");
        System.out.println(objc1.getid());
        System.out.println(objc1.getname());
        System.out.println(objc1.getage());
        //can change after a constructor
        objc1.setage(19);
        System.out.println(objc1.getage());
       

    }

}
