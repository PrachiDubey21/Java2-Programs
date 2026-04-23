
//return type
@FunctionalInterface
interface A {
    int add(int i, int j);
}

// @FunctionalInterface
// interface A {
// void show();
// }

// class B implements A{

// public void show(){

// System.out.println("IN B show");

// }
// }

public class functionalinterface {

    public static void main(String[] args) {

        // A obj = new B();

        // A obj = new A() {
        // //anonymous inner class
        // public void show() {
        // System.out.println("IN A show");
        // }
        // };

        // Lambda expression
        // A obj = () ->
        // {
        // System.out.println("IN shortA show");
        // }
        // ;

        // obj.show();


        // A obj = new A() {
        //     public int add(int i, int j) {
        //         return i + j;
        //     }
        // };


        //  A obj = (int i, int j) -> {
        //         return i + j;
        //     }
        //OR
          A obj = (i,j) -> i + j;
        

        int result = obj.add(5, 4);
        System.out.println("result is " + result);

    }

}
