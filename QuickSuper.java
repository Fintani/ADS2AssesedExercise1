public abstract class QuickSuper extends SortAlg{
    public abstract int[] sort(int[] arr);

    public int partition(int pivot, int start, int end, int[] arr){
        int i = start-1;
        swap(pivot, end, arr);
        int pivotVal = arr[pivot];

        for(int j=start;j<end;j++){
            if(arr[j] <= pivotVal){
                i = i+1;
                swap(i, j, arr);
            }
        }

        swap(i+1,end,arr);
        return i+1;
    }
}
