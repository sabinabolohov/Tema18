//9.Given a list of integers, write a stream pipeline that filters
// out the even numbers and then squares the remaining numbers.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex9 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        List<Integer> squareOddNumbers = numbers.stream()
                .filter(n -> n%2 !=0)
                .map(n -> n*n)
                .collect(Collectors.toList());
        System.out.println(squareOddNumbers);
    }
}
