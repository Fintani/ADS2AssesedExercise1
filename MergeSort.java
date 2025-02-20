public class MergeSort extends MergeSuper{

    public int[] sort(int[] arr){
        int start = 0;
        int length = arr.length;
        int end = length-1;

        mergeSort(start, end, arr);

        return arr;
    }

    public void mergeSort(int start, int end, int[] arr){
        if(start<end){
            int mid = (start+end)/2;
            mergeSort(start, mid, arr);
            mergeSort(mid+1, end, arr);
            merge(start, mid, end, arr);
        }
    }
}
