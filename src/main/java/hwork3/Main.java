package hwork3;
// 1. Нужно покрыть тестами метод на 100%
// Метод проверяет, является ли целое число записанное в переменную n, чётным (true) либо нечётным (false).
// 2. Нужно написать метод который проверяет, попадает ли переданное число в интервал (25;100) и возвращает true, если попадает и false - если нет,
// покрыть тестами метод на 100%
public class Main {

    public boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean numberInInterval(int n) {
        if (n> 25 && n<100) return true;
        return false;
    }
}
