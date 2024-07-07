//6. Create a BinaryOperator<Integer> using a lambda expression that adds two integers.

import java.util.function.BinaryOperator;

public class Ex6 {
    public static void main (String[] args) {
        BinaryOperator<Integer> add = (x, y) -> x+y;

        int num1 = 3;
        int num2 = 9;

        System.out.println(add.apply(num1,num2));
    }
}
