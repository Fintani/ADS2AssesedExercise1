public class DutchFlagQuick extends SortAlg{
    int partStart;
    int partEnd;
    
    public int[] sort(int[] arr){
        int start = 0;
        int end = arr.length -1;

        quickSort(start, end, arr);

        return arr;
    }

    public void quickSort(int start, int end, int[] arr){
        if(start < end){
            dutchPartition(start, end, arr);
            quickSort(start, partStart-1, arr);
            quickSort(partEnd+1, end, arr);
        }
    }

    public void dutchPartition(int start, int end, int[] arr){
        int pivot = arr[end];
        int i = start-1;
        int mid = start-1;

        for(int j=start;j<end;j++){
            if(arr[j] < pivot){
                i = i+1;
                mid = mid+1;
                swap(i, mid, arr);
                swap(i, j, arr);
            } else if (arr[j] == pivot){
                mid = mid+1;
                swap(mid, j, arr);
            }
        }

        mid = mid+1;
        swap(mid,end,arr);
        this.partStart = i+1;
        this.partEnd = mid;
    }
}