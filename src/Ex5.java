//5. Create a UnaryOperator<Integer> using a lambda expression that squares an integer.

import java.util.function.UnaryOperator;

public class Ex5 {
    public static void main(String[] args) {
        UnaryOperator<Integer> square = x -> x * x;

        int num1 = 8;

        System.out.println(square.apply(num1));
    }
}
