package ru.algoritmic;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 1. Бинарный поиск
        int[] array_sort = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}; //сортированный массив;
        Integer guess = Binary_search.binary_search_int(array_sort, 2);  //item -загаданное число
        System.out.println("guess = " +guess);

        // 2. Сортировка выбором


         int[] array = new int[] {4, 11, 5, -9, 6, 1, -2, 3, 7, 8, 10}; //неотсортированный массив;
        int[] array_sort2 = SortAlgorithmByChoice.selectionSort(array);
        System.out.println(Arrays.toString(array_sort2));

         int[] array_sort1 =  SortAlgorithmByChoice.sortAlgorithmByChoice(array);
        System.out.println(Arrays.toString(array_sort1));

//        int[] array2 = new int[] {4, 11, 5, -9, 6, 1, -2, 3, 7, 8, 10}; //неотсортированный массив;

    }
}