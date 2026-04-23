import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionAPI {
	public static void main(String[] args) {

		// Collection<Integer> nums= new ArrayList<Integer>();
		// Collection nums=new ArrayList();
		
		// List<Integer> nums = Arrays.asList(1,2,3,4,5,);

		List<Integer> nums = new ArrayList<Integer>();
		nums.add(6);
		nums.add(5);
		nums.add(8);
		nums.add(2);
		// nums.add("5");

		System.out.println(nums.get(2));

		System.out.println(nums.indexOf(2));

		// for(int n:nums)
		// {
		// System.out.println(nums);
		// }

		System.out.println();

		for (Object n : nums) {
			int num = (Integer) n;
			System.out.println(num);
		}

		System.out.println();
		nums.forEach(n -> System.out.println(n));
	}
}
