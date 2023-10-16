package hwork;

/*Задание 1. ** В классе Calculator создайте метод calculateDiscount, который принимает сумму покупки и
процент скидки и возвращает сумму с учетом скидки. Ваша задача - проверить этот метод с использованием
библиотеки AssertJ. Если метод calculateDiscount получает недопустимые аргументы,
 он должен выбрасывать исключение ArithmeticException. Не забудьте написать тесты для проверки этого поведения.
 */
public class Calculator {
    public static void main(String[] args) {
        System.out.println(calculateDiscount(120, 15));
    }
    public static int calculation(int num1, int num2, char operator) {
        int result;

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            }
            default -> throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }
    public static double calculateDiscount(double sumProduct, int discount) {
        double result;

        if (discount < 0) {
            throw new ArithmeticException("The discount cannot be less than 0%");
        } else if (discount > 90) {
            throw new ArithmeticException("The discount cannot be less than 90%");
        } else if (sumProduct < 0) {
            throw new ArithmeticException("The purchase amount cannot be less than 0%");
        } else {
            double sumDiscount = sumProduct * discount / 100;
            result = sumProduct - sumDiscount;
        }

        return result;
    }

}