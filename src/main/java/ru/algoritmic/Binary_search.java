package ru.algoritmic;

public class Binary_search {

    static Integer binary_search_int (int[] array_sort, int item) {
        Integer guess;                     // ячейка для искомого числа
        int low = 0;                        // нижняя граница массива
        int high  = array_sort.length - 1;  // верхняя граница массива
        int mid;                            // середина массива (между нижней и верхней границей массива)

        while (low <= high) {
            mid = (low + high)/2;
            guess = array_sort[mid];
            if (guess == item) {
                return guess;
            }
            if (guess > item) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
       return null;
    }
}
