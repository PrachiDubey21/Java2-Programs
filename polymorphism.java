import java.util.Scanner;

interface camera {
    void takesnap();

    void recordvideo();

    private void greet() {
        System.out.println("HELU");
    }

    default void video() {
        greet();
        System.out.println("RECORDING>>.....");
    }
}

interface wifi {
    String[] getnetworks();

    void ConnectToNetWork(String network);
}

class myclass {

    void callnumber(int p) {
        System.out.println("calling : " + p);
    }

    void pickcall() {
        System.out.println("calling");
    }

   

}

 class phone extends myclass implements wifi, camera {

      public  void takesnap() {
            System.out.println("clicking : ");
        }

       public void recordvideo() {
            System.out.println("recording : ");
        }

        public String[] getnetworks(){
            System.out.println("getting networks: ");
            String[] g = {"prachi" , "ADiti"};
            return g;
        }

     public    void ConnectToNetWork(String network){
             System.out.println("connecting networks: " + network);

        }






    }

public class polymorphism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        camera c1 = new phone();
        //can not do this as obj is of camera
       // c1.getnetworks();

       phone p1 = new phone();
       p1.getnetworks();
       p1.video();


    }

}
