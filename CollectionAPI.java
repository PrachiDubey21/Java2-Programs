import java.util.ArrayList;
import java.util.Collection;

public class CollectionAPI {

    // collection API -> concept
    // collection -> interface
    // collections -> classes

    public static void main(String[] args) {

       Collection<Integer> nums = new ArrayList<Integer>();
       nums.add(61);
       nums.add(5);
       nums.add(32);
       nums.add(98);

       System.out.println(nums);

       for(int n : nums){
        System.out.println(n);
       }
      
       

    }

}
