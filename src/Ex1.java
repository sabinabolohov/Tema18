//1. Create a Runnable that prints "Hello, World!" using a lambda expression.

public class Ex1 {
    public static void main(String[] args) {

        Runnable runnable = () -> System.out.println("Hello world!");
        Thread thread = new Thread(runnable);
        thread.start();
    }
}