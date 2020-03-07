public class SortOfSort {
    public static void sortOfSort(int[] arr) {
       int max=0;
       int L=arr[0];
       int R = arr.length-1;
       int count =2;


        for (int i = 0; i < arr.length-1; i++) {
           for( int j =0;j<arr.length-1;j++){
               // Checking the position of i
               System.out.print(i+"=i");
               // Right here im checking the position of i and j to see which is larger and when traced when i=0; in the loop. the position of j
               // inside the array 2 7 1 3 0 9 6 5
               // so if j is greater than arr[i]
               if(arr[i]>arr[j]) {
               max = arr[i];
               System.out.print(i+"  "+max+"  ");
               }
               if(count<2) {
                   int temp = arr[L];
                   arr[L] = arr[i];
                   arr[i] = temp;
                   count++;
                   R--;
                   L++;
               }






           }

        }

    }
    public static void main(String[] args) {
        SortOfSort b = new SortOfSort();
        int []arr1 ={9, 8, 1, 4, 10, 3, 2, 1,};
        int[] arr = {2, 7, 1, 3, 0, 9, 6, 5};

        sortOfSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("|"+arr[i]+"   ");
        }


    }


}

