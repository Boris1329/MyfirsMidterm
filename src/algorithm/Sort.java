package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static sun.swing.MenuItemLayoutHelper.max;


public class Sort {

    long executionTime = 0;
    /*
     * Please implement all the sorting algorithm. Feel free to add helper methods.
     * Store all the sorted data into one of the databases.
     */


    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        for (int j = 0; j < array.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        int temp, sortIndex;
        for (int i = 1; i < list.length; i++) {
            temp = list[i];
            sortIndex = i - 1;
            while (sortIndex >= 0 && list[sortIndex] > temp) {
                list[sortIndex + 1] = list[sortIndex];
                sortIndex--;
            }
            list[sortIndex + 1] = temp;
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
        //implement here
    }

    public int[] bubbleSort(int[] array) {

        final long startTime = System.currentTimeMillis();
        int[] list = array;
        int count = 0;
        int temp;
        do {
            count = 0;
            for (int i = 0; i < list.length - 1; i++) {
                if (list[i] > list[i + 1]) {
                    temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    count++;
                }
            }
        } while (count > 0);

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
        //implement here
    }


    public int[] mergeSort(int[] array) {
        int[] list = array;
        //implement here


        return list;
    }


    public void quickSort(int[] array, int first, int second) {
        final long startTime = System.currentTimeMillis();
        int a = first, b = second;
        int[] list = array;
        if (a < b) {
            int pivot = pivot(list, a, b);
            quickSort(list, a, pivot - 1);
            quickSort(list, pivot + 1, b);
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;

    }

    static int pivot(int[] array, int start, int end) {
        int pivot = array[end];
        int count = start - 1;
        for (int i = start; i < end; i++) {
            if (array[i] < pivot) {
                count++;
                swap(array, count, i);

            }
        }
        swap(array, count + 1, end);
        return count + 1;
        //implement here
    }

    private static void swap(int[] array, int count, int i) {

    }

    public int[] heapSort(int[] array) {
        int[] list = array;
        //implement here


        return list;
    }


    public int[] bucketSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        int max = max(list);
        int min = min(list);
        int numberOfBuckets = max - min + 1;
        List<List<Integer>> buckets = new ArrayList<List<Integer>>(numberOfBuckets);
        for (int i = 0; i < numberOfBuckets; ++i) {
            buckets.add(new ArrayList<Integer>());
        }

        for (int value : list) {
            int hash = hash(value, min, numberOfBuckets);
            buckets.get(hash).add(value);
        }

        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket);
        }
        int index = 0;
        for (List<Integer> bucket : buckets) {
            for (int value : bucket) {
                list[index++] = value;
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    private int min(int[] list) {

        return 0;
    }


    private static int hash(int elem, int min, int numberOfBucket) {
        return (elem - min) / numberOfBucket;
        //implement here
    }


    public int [] shellSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        for (int gap = list.length/2; gap > 0; gap /= 2) {
            for (int i = gap; i <list.length; i++) {
                int key = list[i];
                int j = i;
                while (j >= gap && list[j - gap] > key) {
                    list[j] = list[j - gap];
                    j -= gap;
                }
                list[j] = key;
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
        //implement here
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
