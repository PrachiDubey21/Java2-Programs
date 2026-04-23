import java.util.Scanner;

class againbasics{

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        //when we want to store binary in int
        //we write 0b then binary number
        int num=0b101;
        System.out.println(num);

        //hexadecimal
        int num1=0x7E;
        System.out.println(num1);

        int num2=10_00_000_00;
        System.out.println(num2);

        //JDK - java development kit
        //JVM - java virtual machine
        //JRE - java runtime environment

        //array
        /* 
        int nums[][] = new int[3][4];
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.println("enter elements");
                nums[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
            */


        //here n is itself an array
        /* 
        for(int n[]: nums){
            for(int m : n){
                System.out.println(m);
            }

        }
            */

            /* 
        //Jagged array(when we dont know the number of columns)
        int jgarr[][] = new int [2][];

        //now specify each columns(can be different)
        jgarr[0]=new int[2];
        jgarr[1]=new int[4];
        //loop for this is
        for(int i=0 ; i<jgarr.length;i++){
            for(int j=0 ; j<jgarr[i].length;j++){
                //statements
            }
        }
            */

            //string is like a object
            String name = new String("prachi");
            System.out.println(name);

            //short method
            String hahah="hehhehwhw";
            hahah=hahah + "hihihi";
            System.out.println(hahah);

            //for mutable string
            //STRING BUFFER AND STRINGBUILDER

            //stringbuffer is thread safe and builder is not
            StringBuffer s = new StringBuffer("he");
             System.out.println(s.capacity());








    }
}