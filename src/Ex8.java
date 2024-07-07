//8.Given a list of strings, write a stream pipeline
// that converts all the strings to uppercase and collects them into a new list.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex8 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("blue", "orange", "yellow");

        List<String> uppercaseStrings = strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(uppercaseStrings);
    }
}
