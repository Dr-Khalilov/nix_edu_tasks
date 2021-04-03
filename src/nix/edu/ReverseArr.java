package nix.edu;

public class ReverseArr {
    //15.Напишите программу, которая инвертирует массив (значения должны идти в обратном порядке).
    // Проверьте работу программы на нескольких массивах
    static int[] getInvertedArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }

}
