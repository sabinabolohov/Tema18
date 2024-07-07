//4. Create a BiPredicate<String, String> using a lambda expression
// that tests whether the first string is longer than the second string.

import java.util.function.BiPredicate;

public class Ex4 {
    public static void main(String[] args) {
        BiPredicate<String,String> isFirstStringLonger = (s1, s2) -> s1.length() > s2.length();

        String string1 = "shirt";
        String string2 = "blouse";

        System.out.println(isFirstStringLonger.test(string1,string2));
        System.out.println(isFirstStringLonger.test(string2,string1));

    }
}
