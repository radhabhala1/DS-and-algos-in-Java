package Sorting;

public class Sorting {

    public static void main(String[] args) {
        int[] array = {1, -1, 3, 6, 2, 5, 5};
        //array = insertionSort(array);
        //array = selectionSort(array);
        array = bubbleSort(array);
        for (int a : array) {
            System.out.print(a + " ");
        }

    }

    public static int[] insertionSort(int[] array) {
        int length = array.length;
        for (int i = 1; i < length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    exchange(array, j, j - 1);
                }
            }
        }
        return array;
    }

    public static int[] selectionSort(int[] array) {
        int length = array.length;
        int i, j;
        for (i = 0; i < length; i++) {
            int min = i;
            for (j = i + 1; j < length; j++) {
                if (array[min] > array[j]) {
                    min = j;

                }
            }
            exchange(array, i, min);
        }
        return array;
    }

    public static int[] bubbleSort(int[] array) {
        int length = array.length;
        boolean swap = true;
        while (swap) {
            swap = false;
            for (int i = 0; i < length - i; i++) {
                if(array[i]>array[i+1]){
                    exchange(array, i, i+1);
                    swap = true;
                }
            }
        }
    return array;
    }

    public static void exchange(int[] array, int fIndex, int sIndex) {
        int temp = 0;
        temp = array[fIndex];
        array[fIndex] = array[sIndex];
        array[sIndex] = temp;

    }

}
