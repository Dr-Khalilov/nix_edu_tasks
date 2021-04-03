package nix.edu;

public class Fibonacci {
    //9.Создайте программу, которая выведет на экран числа Фибоначчи до указанного числа.
    // Число должно приходить в аргументах
    static void getSeqFibonacci(int numFib) {
        long[] arr = new long[numFib + 1];
        arr[0] = 0;
        arr[1] = 1;
        System.out.print(arr[0] + "\t" + arr[1] + "\t");
        for (int i = 2; i <= numFib; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            System.out.print(arr[i] + "\t");
        }
    }

    static void getSequenceFibonacci(long upNum) {
        long num1 = 0;
        long num2 = 1;
        long num3 = 1;
        long num4;
        System.out.print(num1 + "\t");
        while (num2 <= upNum) {
            num4 = num1 + num2 + num3;
            System.out.print(num2 + "\t");
            num2 = num3;
            num3 = num4;
        }
    }
}
