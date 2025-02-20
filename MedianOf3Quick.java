public class MedianOf3Quick extends QuickSuper{
    
    public int[] sort(int[] arr){
        int start = 0;
        int end = arr.length -1;

        quickSort(start, end, arr);

        return arr;
    }

    public void quickSort(int start, int end, int[] arr){
        if(start < end){
            int pivot = medianPivot(start, end, arr);
            int part = partition(pivot, start, end, arr);
            quickSort(start, part-1, arr);
            quickSort(part+1, end, arr);
        }
    }

    public int medianPivot(int start, int end, int arr[]){
        int mid = start+(end-start)/2;
        
        if((arr[start]<=arr[mid] && arr[mid]<=arr[end]) || (arr[end]<=arr[mid] && arr[mid]<=arr[start])){
            return mid;
        } else if((arr[start]<=arr[end] && arr[end]<=arr[mid]) || (arr[mid]<=arr[end] && arr[end]<=arr[start])){
            return end;
        } else {
            return start;
        }
    }
}
