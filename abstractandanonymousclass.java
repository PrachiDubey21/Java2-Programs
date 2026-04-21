
abstract class A{
    
    public abstract void show();
}


public class abstractandanonymousclass {
    public static void  main(String [] args){

        A obj = new A(){
            
            public void show(){
                System.out.println("in abstract and anonymous inner class");
            }
        };
        obj.show();

    }
}
