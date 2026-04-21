import java.util.Scanner;

public class CONDITIONSandLOOPS {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
         * int age;
         * System.out.println("ENTER YOUR AGE : ");
         * age=sc.nextInt();
         * if(age>=18){
         * System.out.println("YOU CAN VOTE ");
         * }
         * else{
         * System.out.println("YOU CAN NOT VOTE");
         * }
         * 
         */

        /*
         * // switch case
         * int day;
         * System.out.println("ENTER NUMBER FOR A WEEK : ");
         * day = sc.nextInt();
         * 
         * switch (day) {
         * 
         * case 7:
         * System.out.println("sundayyyyyyyyy /n yeyeyeyye");
         * break;
         * 
         * case 1:
         * System.out.println("Monday ahhhh");
         * break;
         * 
         * case 2:
         * System.out.println("tuesday :( ");
         * break;
         * 
         * case 3:
         * System.out.println("wednesdayyy bruh");
         * break;
         * 
         * case 4:
         * System.out.println("thursday ohkie");
         * break;
         * 
         * case 5:
         * System.out.println("ohkyyyy fridayyy");
         * break;
         * 
         * case 6:
         * System.out.println("SATURDAYYYYY");
         * break;
         * default:
         * System.out.println("esa koi day hi nhi h bhai");
         * break;\
         * 
         * 
         * 
         * 
         * }
         */

        // int year=(2100%4);

        // System.out.println(year);

        // LOOPS

        /*
         * 
         * int i = 1;
         * 
         * while (i <= 10) {
         * System.out.println(i++);
         * }
         * 
         * for (i = 0; i <= 25; i++) {
         * System.out.println(i + 5);
         * i++;
         * }
         * 
         * i = 1;
         * 
         * do {
         * System.out.println(i + 10);
         * i++;
         * } while (i <= 100);
         * 
         */

        /*
         * int a;
         * System.out.println("ENTER NUMBER : ");
         * a=sc.nextInt();
         * for(int i=1;i<=a;i++){
         * 
         * System.out.println(i);
         * i++;
         * 
         * }
         */

        /*
         * for(int i=15;i>=1;i--){
         * System.out.println(i);
         * }
         */


         /* 
        System.out.println("ENTER THE NUMBER FOR YOUR MULTIPLICATION TABLE : ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int ans = n * i;
            System.out.println(n + "*" + i + "=" + ans);
        }
        System.out.println("table completed : ");
        */


        //FACTORIAL
         System.out.println("ENTER THE NUMBER : ");
         int n=sc.nextInt();
          int fact=1;

         for(int i=1;i<=n;i++){
           
            fact=i*fact;
    System.out.println(fact);

         }
          System.out.println("YOUR ANSWER IS : " + fact);

    }

}
