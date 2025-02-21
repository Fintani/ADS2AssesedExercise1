public class QuickInsertionSort extends QuickSuper{
    
    public int[] sort(int[] arr){
        int start = 0;
        int end = arr.length -1;

        quickSort(start, end, arr);

        return arr;
    }

    public void quickSort(int start, int end, int[] arr){
        if(start<end && (end-start+1)>11){
            int pivot = end;
            int part = partition(pivot, start, end, arr);
            quickSort(start, part-1, arr);
            quickSort(part+1, end, arr);
        } else {
            new InsertionSort().insertionSort(start, end, arr);
        }
    }
}
