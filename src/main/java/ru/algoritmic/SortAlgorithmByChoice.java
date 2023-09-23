package ru.algoritmic;

import java.util.Arrays;

public class SortAlgorithmByChoice {
    //    МОя функция
    static int[] sortAlgorithmByChoice(int[] array) {
        int[] array_sort = new int[array.length];  //новый массив

        for (int j = array.length - 1; j >= 0; j--) {
            int max = array[array.length - 1];
            int i_max = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] >= max) {
                    max = array[i];
                    array_sort[j] = max;
                    i_max = i;
                }
            }
            array[i_max] = Integer.MIN_VALUE; // заменим найденный максимальный элемент в массиве на MIN_VALUE
        }
        return array_sort;
    }

//     Пример из книги
    //     Функция для нахождения индекса в массиве, в ячейке с которым лежит наименьшее значение
    static private int smallest_index(int[] array) {
        int smallest_index = 0;
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                smallest_index = i;
            }
        }
        return smallest_index;
    }

    //     Функция для сортировки массива по возрастанию
    static public int[] selectionSort(int[] array) {
        int[] array1 = array.clone();            // Чтобы не изменять сам входящий массив, создадим его копию
        int[] newArray = new int[array1.length]; //новый массив, для сортировки
        for (int i = 0; i < newArray.length; i++) {
            int smallest_index = smallest_index(array1);
            newArray[i] = array1[smallest_index];
            array1[smallest_index(array1)] = Integer.MAX_VALUE;
        }
        return newArray;
    }
}
