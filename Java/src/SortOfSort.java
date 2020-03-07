public class SortOfSort {
    public static void sortOfSort(int[] arr) {
       int max=0;
       int L=arr[0];
       int R = arr.length-1;
       int count =2;


        for (int i = 0; i < arr.length-1; i++) {
           for( int j =0;j<arr.length-1;j++){
               if(arr[j]>arr[i]&&count==0) {
                   max = arr[j];
               }
                   //System.out.print(i+"  ");
                   int temp = arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
                  arr[arr.length-1]=arr[arr.length-2];
                  count++;
                  R--;
                 if(count<2){
                     int temp1 =arr[i];
                     arr[i] = arr[L];
                     arr[L] = temp1;

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

