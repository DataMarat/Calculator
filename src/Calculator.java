import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считывание первого числа
        System.out.println("Введите первое число:");
        int first_operand = scanner.nextInt();

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
        int second_operand = scanner.nextInt();

        // Переменная для хранения результата
        float result;

        // Выполнение операции в зависимости от знака
        switch (operation) {
            case '+':
                result = first_operand + second_operand;
                break;
            case '-':
                result = first_operand - second_operand;
                break;
            case '*':
                result = first_operand * second_operand;
                break;
            case '/':
                // Проверка деления на ноль
                if (second_operand != 0) {
                    result = (float) first_operand / second_operand;
                } else {
                    System.out.println("Ошибка: деление на ноль.");
                    return;
                }
                break;
            default:
                // Этот код никогда не должен быть достигнут. Место для пасхалки
                System.out.println("Ошибка: неподдерживаемая операция." + operation);
                return;
        }

        // Вывод результата
        System.out.println("Результат: " + result);
    }
}
