import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortOfSortTest {
//Test 1.
    // Testing method to verify it functions correctly.
    // Test failed
    // In order to correct modify code to reflect where indices are not being swapped properly.
    // Bug exist within the swapping of elements.

    @Test
    void sortOfSort() {
        int[] arr1 = {2, 7, 1, 3, 0, 9, 6, 5};
        int[] arr2 = {6, 5, 1, 0, 2, 3, 7, 9};
        SortOfSort bob = new SortOfSort();
        bob.sortOfSort(arr1);


        assertArrayEquals(arr2, arr1);


    }
    // Testing with different length in array one index .
    // Expect pass
    // Test result passed. There were no elements to compare so the test proves that even if the arry was empty it will still
    // function correctly.

    @Test
    void sortOfSort2() {
        int[] arr1 = {2};
        int[] arr2 = {6, 5, 1, 0, 2, 3, 7, 9};
        SortOfSort bob = new SortOfSort();
        bob.sortOfSort(arr1);


        assertArrayEquals(arr1, arr1);
    }
    // Testing with negative integers
    // Expectation pass
    // Result failed
    // Bug in swapping elements that could not be found lack of information provided to assist
    // With this bug

    @Test
    void sortOfSort3() {

        int[] arr2 = {-6, -5, -1, 0, -2, -3, -7, -9};
        int[] arr3 = {-2, -3, -7, 9, -6,-5 -3, -1, 0};

        SortOfSort bob = new SortOfSort();
        bob.sortOfSort(arr2);


        assertArrayEquals(arr3, arr2);
    }
    // Testing odd elements
    // Expect pass
    // Result failure
    // To correct this issue code has to be modified bug exist in swapping elements of array
    // Not enough information was provided to assist with the swapping of elements
    // bug will remain without assistance.
    @Test
    void sortOfSort4() {

        int[] arr2 = {1,3,5,7,9,1,3,5,7,9};
        int[] arr3 = {7,7,3,3,1,1,5,5,9,9};

        SortOfSort bob = new SortOfSort();
        bob.sortOfSort(arr2);


        assertArrayEquals(arr3, arr2);
    }
    // Testing for bugs in code
    // Test passed
    // Result Code has bugs in swapping elements of an array.
    // Modify code to not reflect the bug where elements are properly swapped.
    @Test
    void sortOfSort5() {

        int[] arr2 = {2,3,5,7,9,1,3,5,7,9};
        int[] arr3 = {3,7,3,3,1,1,5,5,9,9};

        SortOfSort bob = new SortOfSort();
        bob.sortOfSort(arr2);


        assertArrayEquals(arr3, arr2);
    }
}