//7. Given a list of strings, use a lambda expression
// to sort the list in reverse alphabetical order.

import java.util.ArrayList;
import java.util.List;

public class Ex7 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Ben");
        names.add("Tim");
        names.add("John");

        names.sort((String str1, String str2) -> str2.compareTo(str1));

        for (String name : names) {
            System.out.println(name);
        }
    }
}
