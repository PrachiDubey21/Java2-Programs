import java.util.Scanner;

public class basics {

    public static void main(String[] args) {

         Scanner sc =new Scanner(System.in);

        /*
         * System.out.println("GIVE YOUR INPUT");
         * 
         * System.out.println("ENTER NUMBER : ");
         * int num = sc.nextInt();
         * System.out.println(num);
         * 
         * sc.nextLine();
         * 
         * System.out.println("ENTER A STRING : ");
         * String str=sc.nextLine();
         * System.out.println(str);
         * 
         * System.out.println("CHECK IF YOUR NUMBER IS INT OR NOT : ");
         * Boolean b1 = sc.hasNextInt();
         * System.out.println(b1);
         * 
         * sc.nextLine();
         * 
         * System.out.println("ENTER YOUR NAME : ");
         * String name = sc.nextLine();
         * System.out.println("HELLO <" + name + "> have a good day!" );
         * 
         * sc.nextLine();
         */

        /*
         * System.out.println(6==8);
         * System.out.println(5>=9);
         * System.out.println(7<=9);
         * 
         * 
         * //bitwise
         * System.out.println(2&3);
         * //10 & 11 give 10
         * 
         * //modulus
         * System.out.println(4.8%1.1);
         * 
         * 
         * //increment , decrement operators
         * int a=2;
         * System.out.println(a++);
         * System.out.println(a);
         * System.out.println(++a);
         * 
         * System.out.println(a--);
         * System.out.println(a);
         * System.out.println(--a);
         * 
         * 
         * 
         * char c ='a';
         * System.out.println(c++);
         * System.out.println(c);
         * System.out.println(++c);
         * 
         * System.out.println(c--);
         * System.out.println(c);
         * System.out.println(--c);
         * 
         * 
         */

        // EXERCISE
        /*
         * Scanner sc2 = new Scanner(System.in);
         * 
         * System.out.println("ENTER YOUR MARKS FOR EACH SUBJECT : ");
         * System.out.println("MATHEMATICS");
         * int a = sc2.nextInt();
         * 
         * System.out.println("ENGLISH");
         * int b = sc2.nextInt();
         * 
         * System.out.println("PHYSICS");
         * int c = sc2.nextInt();
         * 
         * System.out.println("CHEMISTRY");
         * int d = sc2.nextInt();
         * 
         * System.out.println("GRAPHICS");
         * int e = sc2.nextInt();
         * 
         * int sum=a+b+c+d+e;
         * double percentage=(sum/500.0)*100;
         * 
         * System.out.println("your total marks out of 500 is : " + sum);
         * System.out.println("your percentage is : " + percentage + "%");
         */

        // typecasting
        /*
         * char grade='b';
         * grade=(char)(grade+8);
         * System.out.println(grade);
         */

        /*
         * //different ways of printing
         * int a=4; //%d
         * float f =4.55f; // %f
         * char ch = 'A'; //%c
         * String name = "prachi"; //%s
         * 
         * System.out.println("hello my name is ");
         * System.out.println(name);
         * 
         * System.out.print("hello my name is : ");
         * System.out.print(name);
         * 
         * System.out.println("\n");
         * 
         * System.out.printf("hello my name is %s" , name);
         * System.out.format("hello my name is %s" , name);
         * 
         */

        // STRING METHODS
        String name = "PrAcHi";
        String names = "    prachi aditi vikas pratibha ";

        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(names.trim());
         System.out.println(name.substring(3));
          System.out.println(name.substring(1,4));

        //name=name.toUpperCase();
        //System.out.println(name);

    }

}
