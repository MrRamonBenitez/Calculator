import java.util.function.*;

public class Calculator {

    public static double POSITIVE_INFINITY = Double.longBitsToDouble(0x7ff0000000000000L);

    static Supplier instance = Calculator::new;

    Consumer<Integer> println = System.out::println;
    Consumer<String> printer = System.out::println;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    // BinaryOperator<Integer> devide = (x, y) -> x / y; - начальный вариант
    BinaryOperator<Double> devide = (x, y) -> y != 0 ? x / y : POSITIVE_INFINITY;

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

}
