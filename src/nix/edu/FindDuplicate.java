package nix.edu;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {
    /*    16.Напишите программу, которая найдет дубликаты в массиве чисел.
             Проверьте работу программы на нескольких массивах*/
    static Integer[] getDuplicateValue(int[] array) {
        Set<Integer> dupValue = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            Integer instance1 = array[i];
            if (instance1 == null) {
                continue;
            }
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    continue;
                }
                Integer instance2 = array[j];
                if (instance1.equals(instance2)) {
                    dupValue.add(instance2);
                }
            }
        }
        Integer[] dupValArr = dupValue.toArray(new Integer[0]);
        return dupValArr;
    }

    static Integer[] getDupValues(Integer[] array) {
        Set<Integer> dupValues = new HashSet<>();
        Arrays.sort(array);
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1].equals(array[i])) {
                dupValues.add(array[i]);
            }
        }
        Integer[] uniqueValArr = dupValues.toArray(new Integer[0]);
        return uniqueValArr;
    }
}
