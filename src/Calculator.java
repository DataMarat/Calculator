import java.util.Scanner;

public class Calculator {

    public static double compute(char operation, double first_operand, double second_operand) {
        // Переменная для хранения результата
        double result;

        // Выполнение операции в зависимости от знака
        switch (operation) {
            case '+':
                result = MathOperations.add(first_operand, second_operand);
                break;
            case '-':
                result = MathOperations.subtract(first_operand, second_operand);
                break;
            case '*':
                result = MathOperations.multiply(first_operand, second_operand);
                break;
            case '/':
                result = MathOperations.divide(first_operand, second_operand);
                break;
            default:
                // Этот код никогда не должен быть достигнут. Место для пасхалки
                System.out.println("Ошибка: неподдерживаемая операция." + operation);
                return 0;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считывание первого числа
        System.out.println("Введите первое число:");
        double first_operand = scanner.nextDouble();

        // Переменная для операции
        char operation = ' ';
        int totalAttempts = 0;
        boolean validOperation = false;

        // Проверка операции, максимум 3 попытки
        while (totalAttempts < 3) {
            System.out.println("Введите операцию (+, -, *, /):");
            operation = scanner.next().charAt(0);

            if (operation == '+' || operation == '-' || operation == '*' || operation == '/') {
                validOperation = true;
                break;
            } else {
                System.out.println("Ошибка: неподдерживаемая операция. Попробуйте ещё раз.");
                totalAttempts++;
            }
        }

        // Если после 3 попыток вид операции не был введен корректно, завершить выполнение программы
        if (!validOperation) {
            System.out.println("Я с такими операндами не работаю и точка.");
            return;
        }

        // Считывание второго числа
        System.out.println("Введите второе число:");
        double second_operand = scanner.nextDouble();

        // Вычисление значения
        double result = compute(operation, first_operand, second_operand);

        // Вывод результата
        System.out.println("Результат: " + result);
    }
}
