package nix.edu;

public class Calculator {
    /*  4. Создайте программу, которая складывает / перемножает / вычитает / делит два числа и выводит
        на экран результат. Оба числа и желаемая операция должны приходить в аргументах*/
    static double calculator(double number1, double number2, char sign) {
        switch (sign) {
            case '+':
                return sum(number1, number2);
            case '-':
                return subtraction(number1, number2);
            case '*':
                return multiplication(number1, number2);
            case '/':
                return division(number1, number2);
            default:
                return 0.0;
        }
    }

    static double sum(double num1, double num2) {
        return num1 + num2;
    }

    static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    static double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    static double division(double num1, double num2) {
        return num1 / num2;
    }
}
