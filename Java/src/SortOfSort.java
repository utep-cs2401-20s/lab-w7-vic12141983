public class SortOfSort {
    public static void sortOfSort(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        int counter = 0;
        int large = arr.length-1;


        for( int i =0;i<arr.length;i++) {
            if(arr[i]>max&&counter>2){
                max=arr[i];
              int temp = arr[large];
              arr[i] = arr[large];
              arr[large] = temp;
              large = large -1;
                System.out.print(max);
              counter++;

            }

        }

    }


    public static void main(String[] args) {
        int n[] = {2, 7, 1, 3, 0, 9, 6, 5};
        sortOfSort(n);
       //printStuff(n);


    }

    public static void printStuff(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

