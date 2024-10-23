public class MathOperations {
    public static int add(int x, int y) {
        return x + y;
    }
    public static int subtract(int x, int y) {
        return x - y;
    }
    public static int multiply(int x, int y) {
        return x*y;
    }
    public static float divide(int x, int y) {
        if (y != 0) {
            return (float) x / y;
        } else {
            System.out.println("Ошибка: деление на ноль.");
            throw new IllegalArgumentException("Ошибка: деление на ноль.");
        }
    }
}
