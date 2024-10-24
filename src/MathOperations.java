public class MathOperations {
    public static double add(double x, double y) {return x+y;}
    public static double subtract(double x, double y) {
        return x - y;
    }
    public static double multiply(double x, double y) {
        return x*y;
    }
    public static double divide(double x, double y) {
        if (y != 0) {
            return (float) x / y;
        } else {
            System.out.println("Ошибка: деление на ноль.");
            throw new IllegalArgumentException("Ошибка: деление на ноль.");
        }
    }
}
