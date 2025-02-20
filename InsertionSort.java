public class InsertionSort extends SortAlg {

    public int[] sort(int[] arr){
        int start = 0;
        int end = arr.length-1;
        insertionSort(start, end, arr);
        return arr;
    }

    public void insertionSort(int start, int end, int[] arr){

        for(int i=start+1; i<=end; i++){
            int key = arr[i];
            int j = i-1;

            while(j>=start && arr[j]>key){
                arr[j+1] = arr[j];
                j = j-1;
            }

            arr[j+1] = key;
        }
    }
}
