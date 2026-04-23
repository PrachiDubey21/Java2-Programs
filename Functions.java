import java.util.Scanner;

public class Functions {

    static int variableargs(int... arr) {

        // available as an array (int arr[])

        int sum = 0;
        for (int a : arr) {
            sum = sum + a;
        }
        return sum;
    }

    static void changes(int[] arr, int a) {
        arr[2] = 100;
        a = 9;
    }

    static int operation(int a, int b) {
        return (a + b) * (a - b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         * System.out.println("ENTER YOUR TWO NUMBER : ");
         * int a = sc.nextInt();
         * int b = sc.nextInt();
         * int result=operation(a,b);
         * 
         * System.out.println(result);
         * 
         * //another way of calling a function
         * //in this way we don't have to use the keyword static in the function name
         * // classname object = new classname();
         * Functions obj = new Functions();
         * int result2=obj.operation(a,b);
         * System.out.println(result2);
         */

        int arr[] = { 34, 56, 23, 7, 8 };
        int a = 6;

        // changes(arr,a);
        // System.out.println(arr[2]);
        // System.out.println(a);

        // METHOD OVERLOADING CAN NOT BE PERFORMED
        // BY CHANGING THE RETURN TYPE OF FUNCTIONS

        /*
         * //VARIABLE ARGUMENTS
         * int sum=0;
         * sum=variableargs(4,6,78);
         * System.out.println(sum);
         */

    }

}
