public class InsertionSort implements SortAlg {

    public int[] sort(int[] arr){
        int length = arr.length;

        for(int i=1; i<length; i++){
            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j = j-1;
            }

            arr[j+1] = key;
        }

        return arr;
    }
}
