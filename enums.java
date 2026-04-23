
enum laptop{

    //class

    //objects
    macbook(2200) , windows(2000) , think(1900);

    //variable
    int price;

    //constructor
    private laptop(int price){
        this.price=price;
    }

    //methods
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    

}




enum status{

    //named constants
    //0        1        2        3
    running,failing,stopped,completed;

}

public class enums {

    public static void main(String[] args ){

        status s = status.running;
        status[] s1 = status.values();
        System.out.println(s);
        System.out.println(s.ordinal());
        System.out.println(s1[1]);


        //class implementation
        laptop lap = laptop.macbook;
        System.out.println(lap + " : " + lap.getPrice());




    }
    
}
