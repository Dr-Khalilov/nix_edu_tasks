package nix.edu;

public class SortingArray {
    //12.Напишите программу, которая отсортирует массив по возрастанию.
    // Проверьте работу программы на нескольких массивах
    static int[] getSortedArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
