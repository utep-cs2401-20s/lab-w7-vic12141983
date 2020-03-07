public class SortOfSort {
    public SortOfSort(){

    }


    public static void sortOfSort(int[] arr) {
        // Max variable in order to compare elements to sort
        int max = arr[0];
        // Variable at index to change elements in array when count is reached
        int L = arr[0];
        // Right index to move elements to this index and also decrement
        int R = arr.length - 1;
        // counter to keep track how many elements at left and right index as they move towards the middle.
        int count = 0;
        // for loop traverse the arr at arr[i] and arr[j]
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                // if arr[i] is greater than the j index then tat index becomes the largest
                // in this case given the array in the main method would be largest at the index i.
                if (arr[i] > arr[j] && count < 2) {
                    max = arr[i];
                    // temporary value to hold value 9 at index i

                    int temp = max;
                    // Swapping max index which has value of 9 at index i to the last index of the array.
                    max = arr.length - 1;
                    // Moving last index of array to position where element 9 was at that index i.
                    arr[arr.length - 1] = max;
                    //Decrement the index to hold value 9 at the end index.
                    R--;
                    //Increment index so when i is one there will be at least two open positions to swap to the left side.
                    L++;
                    // Increment count in order to keep track how many elements to put at left and right indices
                    count++;
                } else if (arr[i] > arr[j] && count == 1) {
                    // max element stored in temp;
                    int temp1 = max;
                    // max element is switched with element at index to left
                    max = L;
                    // left moves to temp;
                    L = temp1;
                    // decrement count to move to right
                    count--;
                    // increment right because of loop it will go down all the to -1;

                    R++;
                    // decrement left same it will reach the end of the loop in previous statement.
                    L--;

                }


            }

        }


    }


}