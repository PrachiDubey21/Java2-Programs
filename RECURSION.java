import java.util.Scanner;

public class RECURSION {

    static void factorial(int fact){
        if(fact==1){
            return;
        }
        factorial(fact-1);
        
        int ans=1;
        for(int i =1 ;i <=fact ; i++){
            ans=ans*i;
        }

        System.out.println("the factorial of : " + fact + " is " + ans);
        return;



    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

         int fact =10;
         factorial(fact);

    }
    
}
