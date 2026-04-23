
class A{
    int data;

    public void show(){
        System.out.println("in show");
    }

    class B{
        public void show1(){
            System.out.println("in show 1");
        }
    }

    static class C{
        public void show2(){
            System.out.println("in show 2");
        }

    }
}


public class Innerclass {

    public static void main(String[] args){
 
    A obj = new A();
    obj.show();

    //for normal class
    A.B obj1 = obj.new B();
    obj1.show1();

    //for static class
     A.C obj2 = new A.C();
    obj2.show2();
    
    }
}
