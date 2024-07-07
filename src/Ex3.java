//3. Create a Function<String, Integer> using a lambda expression
// that takes a string and returns its length.

import java.util.function.Function;

public class Ex3 {
    public static void main(String[] args) {
        Function<String,Integer> stringLengthFunction = s -> s.length();

        String string1 = "watch";
        String string2 = "telephone";

        System.out.println(stringLengthFunction.apply(string1));
        System.out.println(stringLengthFunction.apply(string2));
    }
}
