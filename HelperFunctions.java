public class HelperFunctions {
    
    public static void swap(int index1, int index2, int[] arr){
        int holder = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = holder;
    }

    public static int partition(int start, int end, int[] arr){
        int endElement = arr[end];
        int i = start-1;

        for(int j=start;j<end;j++){
            if(arr[j] <= endElement){
                i = i+1;
                swap(i, j, arr);
            }
        }

        swap(i+1,end,arr);
        return i+1;
    }

    public static void merge(int start, int mid, int end, int[] arr){
        int n = mid-start+1;
        int m = end-mid;

        int[] lArray = new int[n+1];
        for(int i=start;i<=mid;i++){
            lArray[i-start] = arr[i];
        }

        int[] rArray = new int[m+1];
        
        for(int i=mid+1;i<=end;i++){
            rArray[i-(mid+1)] = arr[i];
        }
        lArray[n] = Integer.MAX_VALUE;
        rArray[m] = Integer.MAX_VALUE;

        int i = 0;
        int j = 0;

        for(int k=start;k<end;k++){
            if(lArray[i]<=rArray[j]){
                arr[k] = lArray[i];
                i = i+1;
            }else{
                arr[k] = rArray[j];
                j = j+1;
            }
        }
    }
}