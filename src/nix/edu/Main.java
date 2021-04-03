package nix.edu;

import java.util.Arrays;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        //3 task
        out.println("Full name:" );
        out.println(FullName.getFullName("Umar", "Khalilov"));
        out.println();

        //4 task
        out.println("Func sum: " + Calculator.calculator(100, 100, '+'));
        out.println("Func subtraction: " + Calculator.calculator(100, 10, '-'));
        out.println("Func multiplication: " + Calculator.calculator(10, 10, '*'));
        out.println("Func division: " + Calculator.calculator(81, 9, '/'));
        out.println();

        //6 task
        out.println("From Fahr to Cels: " + ConverterTemperature.getDegCelsiusFromFahrenheit(41));
        out.println("From Cels to Fahr: " + ConverterTemperature.getDegFahrenheitFromCelsius(10));
        out.println();

        //7 task
        out.println("Calc sum from number: " + CalculateSumNumber.getSumNumbers(123));
        out.println();

        //8 task
        MultiplicationTable.createMultiplicationTable(9);
        out.println();

        //9 task
        out.println("Sequence Fibonacci:");
        Fibonacci.getSeqFibonacci(10);
        out.println();
        Fibonacci.getSequenceFibonacci(50);
        out.println("\n");

        //10 task
        out.println("Random day of week");
        out.println(GenerateRandomDay.getRandomDayOfWeek());
        out.println();

        //11 task
        out.println("Drawing floyd triangle:");
        FloydTriangle.getFloydTriangle(5);
        out.println();

        //12 task
        out.println("Sorted arrays:");
        int[] arr = {2, 1, 42, 42, 1321, 42, 1314, 54};
        out.println(Arrays.toString(SortingArray.getSortedArray(arr)));
        out.println(Arrays.toString(SortingArray.getSortedArray(new int[]{24, 13, -1, 2, 4, 70, 44})));
        out.println();

        //13 task
        out.println("Average values from arrays:");
        float[] arr0 = {1, 2, 7, 30, 5, 70, 44};
        float[] arr1 = {13, 42, 12, 11, 10, 34, 53, -20, -5, -2, -32};
        float[] arr2 = {2, 4, 1, 42, 1, 34, 553, 63, 1};
        out.println(AvgOfArray.getAvgFromArr(arr0));
        out.println(AvgOfArray.getAvgFromArr(arr1));
        out.println(AvgOfArray.getAvgFromArr(arr2));
        out.println();

        //14 task
        float[] arr3 = {24, 13, -1, 2, 4, 70, 44};
        float[] arr4 = {0, 3, 1, 4, 5, 2, 8, 55};
        MinMaxValue.getMinMaxValue(arr3);
        MinMaxValue.getMinMaxValue(arr4);
        out.println();

        //15 task
        out.println("Inverted arrays:");
        int[] arr5 = {1, 2, 7, 30, 5, 70, 44};
        out.println(Arrays.toString(ReverseArr.getInvertedArray(arr5)));
        out.println(Arrays.toString(ReverseArr.getInvertedArray(new int[]{32, 4, 2, 13, 42, 52, 1})));
        for (int i : ReverseArr.getInvertedArray(new int[]{3, 4, 5, 6, 7, 8, 2, 1, 10})) {
            out.print(i + ", ");
        }
        out.println("\n");

        //16 task
        out.println("Duplicate values");
        out.println(Arrays.toString(FindDuplicate.getDuplicateValue(new int[]{1, 2, 2, 30, 5, 70, 44, 30})));
        out.println(Arrays.toString(FindDuplicate.getDuplicateValue(new int[]{5, 3, 5, 3, 3, 70, 100, 70})));
        out.println(Arrays.toString(FindDuplicate.getDupValues(new Integer[]{111, 12, 12, 2, 3, 4, 4, 4})));
        out.println();

        //17 task
        out.println("Overlapping values from two arrays");
        int[] array1 = {1, 2, 7, 30, 5, 70, 44};
        int[] array2 = {6, 4, 1, 17, 3, 28, 99, 30};
        out.println(Arrays.toString(IntersectArray.getIntersectValue(array1, array2)));
    }
}
