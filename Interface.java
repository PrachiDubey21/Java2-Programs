import java.util.Scanner;

interface cycle{
    void brake(int decrement);
    void speedup(int increment);

    default void horn(){
        System.out.println("hahahahha");
    }
}

interface bicycle extends cycle{
    void gear();
}

class herocycle implements cycle{

    int speed=100;

       // Implementing interface methods
    public void brake(int d) {
        speed = speed - d;
        System.out.println("Braking... Current speed: " + speed);
    }

    public void speedup(int i) {
        speed = speed + i;
        System.out.println("Speeding up... Current speed: " + speed);
    }
}


public class Interface {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        herocycle h = new herocycle();
        h.brake(20);



    }
    
}
