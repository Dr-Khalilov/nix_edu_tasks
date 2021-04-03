package nix.edu;

public class MinMaxValue {
    //14.Напишите программу, которая посчитает min и max значение в массиве.
    //Проверьте работу программы на нескольких массивах
    static void getMinMaxValue(float[] array) {
        float minValue = 0f;
        float maxValue = 0f;
        for (int i = 0; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
            } else if (maxValue < array[i]) {
                maxValue = array[i];
            }
        }
        System.out.println("Min value " + minValue + "\t" + "Max value " + maxValue);
    }
}
