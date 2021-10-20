import java.util.Objects;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        int number1 = 0;
        int number2 = 0;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите первое число");
            number1 = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Вы ввели не число!");
        }

        System.out.println("Выберите операцию (+, -, *, /):");
        Operation action = Operation.getOperation(scanner.nextLine());

        try {
            System.out.println("Введите второе число");
            number2 = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Вы ввели не число!");
        }

        switch (Objects.requireNonNull(action)) {
            case PLUS:
                System.out.println(number1 + number2);
                break;
            case MINUS:
                System.out.println(number1 - number2);
                break;
            case DIVIDE:
                try {
                    if (number2 == 0)
                        System.out.println(number1 / number2);
                    break;
                } catch (ArithmeticException a) {
                    System.out.println("Делить на ноль нельзя");
                }

            case MULTIPLICATION:
                System.out.println(number1 * number2);
                break;
        }

    }
}

