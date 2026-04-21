
class A{

    public void show() throws ClassNotFoundException {

        
        Class.forName("hahi");
        
    }
}

public class throwS {

    static{
        System.out.println("class loaded");

    }
    public static void main(String[] args){

        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            
           System.out.println("class not found");
        }

    }
    
}
