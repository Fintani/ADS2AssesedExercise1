public class SelectionSort extends SortAlg{

    public int[] sort(int[] arr){
        int length = arr.length;

        for(int i=0; i<length-1; i++){
            int minIndex = findMin(i+1, length, arr, i);
            swap(i, minIndex, arr);
        }

        return arr;
    }

    public int findMin(int start, int length, int[] arr, int minIndex){
        for(int i=start; i<length; i++){
            if (arr[minIndex] > arr[i]){
                minIndex = i;
            }
        }

        return minIndex;
    }
}
