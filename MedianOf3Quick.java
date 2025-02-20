public class MedianOf3Quick implements SortAlg{
    
    public int[] sort(int[] arr){
        int start = 0;
        int end = arr.length -1;

        quickSort(start, end, arr);

        return arr;
    }

    public void quickSort(int start, int end, int[] arr){
        if(start < end){
            int part = HelperFunctions.partition(start, end, arr);
            quickSort(start, part-1, arr);
            quickSort(part+1, end, arr);
        }
    }

    public int medianPartition(int start, int end, int arr[]){
        int mid = (start-end)/2;
        int[] partitions = {arr[start], arr[mid], arr[end]};
        int max = 0;
        int min = 0;
        int median = 0;
        for(int i=1;i<partitions.length;i++){
            if(partitions[i] < min){
                min = i;
            } else if(partitions[i] > max){
                max = i;
            } else {
                median = i;
            }
        }
        return median;
    }
}
