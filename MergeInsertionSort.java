public class MergeInsertionSort extends MergeSuper{
    
    public int[] sort(int[] arr){
        int start = 0;
        int length = arr.length;
        int end = length-1;

        mergeSort(start, end, arr);

        return arr;
    }

    public void mergeSort(int start, int end, int[] arr){
        if(start<end && (end-start+1)>11){
            int mid = (start+end)/2;
            mergeSort(start, mid, arr);
            mergeSort(mid+1, end, arr);
            merge(start, mid, end, arr);
            
        } else {
            new InsertionSort().insertionSort(start, end, arr);
        }
    }
}
