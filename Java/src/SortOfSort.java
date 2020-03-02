public class SortOfSort {
    public static void sortOfSort(int[] arr) {
        int max =0;
        int min =0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>max){
                max = arr[i];
                if(arr[i]<max){
                    min =arr[i];

                }


            }


        }
    }
    public static void main(String[] args) {
        int n[] = {2,7,1,3,0,9,6,5};
        sortOfSort(n);



    }
}
