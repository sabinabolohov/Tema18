//12. Given a list of integers, write a stream pipeline that
// removes duplicates and collects the unique integers into a list.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex12 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,5,1,7,2,4,2);
        List<Integer> uniqueNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqueNumbers);
    }
}
