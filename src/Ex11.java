//11. Given a list of integers, write a stream pipeline that
// calculates the sum of all the integers.
import java.util.Arrays;
import java.util.List;

public class Ex11 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12,7,1);

        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum);
    }
}