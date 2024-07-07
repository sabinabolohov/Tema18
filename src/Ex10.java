//10. Given a list of integers, write a stream pipeline that finds the maximum value.

import java.util.Arrays;
import java.util.List;

public class Ex10 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(25,7,46);
        Integer max = numbers.stream()
                .max(Integer::compareTo)
                .orElseThrow();
        System.out.println(max);
    }
}