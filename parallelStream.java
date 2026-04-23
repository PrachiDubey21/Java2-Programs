import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;

public class parallelStream {

    public static void main(String[] args) {

        int size = 5000;
        List<Integer> nums = new ArrayList<Integer>(size);

        // filling with rangom numbers
        Random ran = new Random();
        for (int i = 1; i <= size; i++) {
            nums.add(ran.nextInt(100));
        }
        // System.out.println(nums);

        int sum = nums.stream()
                .map(n -> n * 2)
                .reduce(0, (c, e) -> c + e);
        // System.out.println(sum);

        long startseq = System.currentTimeMillis();
        int sum1 = nums.stream()
                .map(n -> n * 2)
                .mapToInt(n -> n)
                .sum();
        long endseq = System.currentTimeMillis();
        // System.out.println(sum1);

        //in genreal faster
        // but slower in smaller operations
        long startpara = System.currentTimeMillis();
        int sum2 = nums.parallelStream()
                .map(n -> n * 2)
                .mapToInt(n -> n)
                .sum();
        long endpara = System.currentTimeMillis();
        // System.out.println(sum2);

        System.out.println("sum seq = " + sum1 + "sum para = " + sum2);
        System.out.println("seq = " + (endseq - startseq));
        System.out.println("para = " + (endpara - startpara));
    }

}
