
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class optionalclass {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("prachi", "aditi", "pratibha", "vikas");

        Optional<String> ans = names.stream()
                .filter(str -> str.contains("x"))
                // this returns an optionalclass obj
                // to avoid null pointer exception
                //returns 1st name
                .findFirst();

             //   System.out.println(ans.get());
                System.out.println(ans.orElse("not found"));

                //can also do this
    //             String ans = names.stream()
    //             .filter(str -> str.contains("x"))
                
    //             .findFirst()
    //             .orElse("not found");
    // }

}
