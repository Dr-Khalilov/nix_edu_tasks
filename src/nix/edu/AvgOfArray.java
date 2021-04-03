package nix.edu;

public class AvgOfArray {
    //13.Напишите программу, которая посчитает среднее значение в массиве положительных чисел.
    // Проверьте работу программы на нескольких массивах
    static float getAvgFromArr(float[] array) {
        float result = 0f;
        int lengthArr = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                result += array[i];
                lengthArr++;
            } else {
                continue;
            }
        }
        return result / lengthArr;
    }
}
