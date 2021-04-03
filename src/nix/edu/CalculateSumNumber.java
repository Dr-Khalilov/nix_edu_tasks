package nix.edu;

public class CalculateSumNumber {
    // 7.Создайте программу, которая принимает целое число и суммирует его цифры.
    // Число должно приходить в аргументах.
    static int getSumNumbers(int number) {
        String num = " " + number;
        String[] arrNum = num.split("");
        int result = 0;
        for (int i = 1; i < arrNum.length; i++) {
            result += Integer.parseInt(arrNum[i]);
        }
        return result;
    }
}
