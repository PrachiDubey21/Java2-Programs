import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("aditi", "vikas", "pratibha");

        List<String> unames = names.stream()
                .map(String::toUpperCase)
                // .map(name -> name.toUpperCase()) // convert each name to uppercase
                .toList();

        unames.forEach(System.out::println);
        // unames.forEach(n -> System.out.println(n));
        System.out.println(unames);

    }
}
