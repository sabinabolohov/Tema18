//2. Create a Comparator<String> using a lambda
// expression that compares strings based on their length.

import java.util.Comparator;

public class Ex2 {
    public static void main(String[] args) {
        Comparator<String> comparator = (s1, s2) -> Integer.compare(s1.length(), s2.length());

        String string1 = "desk";
        String string2 = "chair";

        System.out.println(comparator.compare(string1, string2));
        System.out.println(comparator.compare(string2, string1));
    }
}
