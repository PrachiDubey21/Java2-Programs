import java.util.Scanner;

public class ARRAYS {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        /* 

        int[] marks;
        marks=new int[10];
        marks[0]=1;

        int[] hello = {2,5,7,45,8};
        int n= hello.length;
         System.out.println(n);
        
         for(int element : hello){
            System.out.println(element);
         }

         */


         //2D ARRAYS
         /* 
         int[][] subjectsMarks = new int [5][5];

         for(int i=0;i<5;i++){
            int k=i+1;
            System.out.println("ENTER MARKS FOR SUBJECT " + k + ":" );
            for(int j=0;j<5 ; j++){
               int h=j+1;
               System.out.println("ENTER MARKS FOR " + k + " SUBJECT AND " + h + " COPY : ");
               subjectsMarks[i][j]=sc.nextInt();
            }
         }
            */


            /* 
            //SUM OF MATRICS
            int[][] arr1={{2,4,6},{8,10,12}};
            int[][] arr2={{1,3,5},{7,9,11}};
            int[][] result={{0,0,0},{0,0,0}};

            for(int i=0;i<arr1.length;i++){
               for(int j=0;j<arr1[i].length;j++){
                  result[i][j] = arr1[i][j] + arr2[i][j];
               }
            }

             for(int i=0;i<arr1.length;i++){
               for(int j=0;j<arr1[i].length;j++){
             System.out.print(result[i][j]);
             System.out.print("   ");
               }
               System.out.print("\n");
            }

            */


            //reverse an array;
            int[] arr = {12,45,78,10,98,65,32,1,6};
            int mid=arr.length/2;
            int l=arr.length;
            int temp ;
            for(int i=0;i<mid;i++){
               temp=arr[i];
               arr[i]=arr[l-1-i];
               arr[l-1-i]=temp;
            }

            for(int element : arr){
               System.out.println(element);
            }
            
    }
    
}
