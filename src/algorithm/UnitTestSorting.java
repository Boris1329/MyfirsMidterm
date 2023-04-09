package algorithm;


import org.junit.Assert;

public class UnitTestSorting {

    /*
      This class is about Unit testing for Sorting Algorithm.
     */
    public static void main(String[] args) {
        int [] unSortedArray = {6,9,2,5,1,0,4};
        int [] sortedArray =   {0,1,2,4,5,6,9};
        boolean sortedArr = true;
        //Create Sort object
        Sort sort = new Sort();
        //apply unsorted array to selectionSort.
        sort.selectionSort(unSortedArray);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray);
        }catch(Exception ex){
            ex.getMessage();
        }

        //Now implement Unit test for rest of the soring algorithm...................below





            unSortedArray = new int[]{6, 9, 2, 5, 1, 0, 4};
            sort.insertionSort(unSortedArray);
            sortedArr = true;
            for(int i = 0; i<sortedArray.length; i++) {
                if(sortedArray[i] != unSortedArray[i]) {
                    sortedArr = false;
                }
            }
            Assert.assertTrue(sortedArr);
            System.out.println("Insertion sorting test passed");



            unSortedArray = new int[]{6, 9, 2, 5, 1, 0, 4};
            sort.selectionSort(unSortedArray);
            sortedArr = true;
            for(int i = 0; i<sortedArray.length; i++) {
                if(sortedArray[i] != unSortedArray[i]) {
                    sortedArr = false;
                }
            }
            Assert.assertTrue(sortedArr);
            System.out.println("Selection sorting test passed");



            unSortedArray = new int[]{6, 9, 2, 5, 1, 0, 4};
            sort.bubbleSort(unSortedArray);
            sortedArr = true;
            for(int i = 0; i<sortedArray.length; i++) {
                if(sortedArray[i] != unSortedArray[i]) {
                    sortedArr = false;
                }
            }
            Assert.assertTrue(sortedArr);
            System.out.println("Bubble sorting test passed");



            unSortedArray = new int[]{6, 9, 2, 5, 1, 0, 4};
            sort.quickSort(unSortedArray,0,unSortedArray.length-1);
            sortedArr = true;
            for(int i = 0; i<sortedArray.length; i++) {
                if(sortedArray[i] != unSortedArray[i]) {
                    sortedArr = false;
                }
            }
            Assert.assertTrue(sortedArr);
            System.out.println("Quick sorting test passed");


        unSortedArray = new int[]{6, 9, 2, 5, 1, 0, 4};
            sort.bucketSort(unSortedArray);
            sortedArr = true;
            for(int i = 0; i<sortedArray.length; i++) {
                if(sortedArray[i] != unSortedArray[i]) {
                    sortedArr = false;
                }
            }
            Assert.assertTrue(sortedArr);
            System.out.println("Bucket sorting test passed");


        unSortedArray = new int[]{6, 9, 2, 5, 1, 0, 4};
            sort.shellSort(unSortedArray);
            sortedArr = true;
            for(int i = 0; i<sortedArray.length; i++) {
                if(sortedArray[i] != unSortedArray[i]) {
                    sortedArr = false;
                }
            }
            Assert.assertTrue(sortedArr);
            System.out.println("Shell sorting test passed");



    }
}
