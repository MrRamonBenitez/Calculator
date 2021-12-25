public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1 , 1);
        // int c = calc.devide.apply(a, b); при указанных выше значениях аргументов при выполнении операции деления
        //                                  произойдет деление на ноль и, соответственно, будет выброшено исключение
        //                                  ArithmeticException
        double c = calc.devide.apply((double)a, (double)b);

        if (c != calc.POSITIVE_INFINITY)
            calc.println.accept((int) c);
        else
            calc.printer.accept("Деление на ноль!");

    }

}
