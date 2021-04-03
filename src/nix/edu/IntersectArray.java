package nix.edu;

import java.util.*;

public class IntersectArray {
    //    17.Напишите программу, которая найдет пересечение в двух массивах чисел.
    //    Проверьте работу программы на нескольких массивах
    static Integer[] getIntersectValue(int[] arr1, int[] arr2) {
        List<Integer> intersectArr = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    intersectArr.add(arr2[j]);
                }
            }
        }
        Integer[] againArr = intersectArr.toArray(new Integer[0]);
        return againArr;
    }
}
