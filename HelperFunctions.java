public class HelperFunctions {
    
    public static void swap(int index1, int index2, int[] arr){
        int holder = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = holder;
    }

    public static int partition(int start, int end, int[] arr){
        int pivot = arr[end];
        int i = start-1;

        for(int j=start;j<end;j++){
            if(arr[j] <= pivot){
                i = i+1;
                swap(i, j, arr);
            }
        }

        swap(i+1,end,arr);
        return i+1;
    }

    public static void merge(int start, int mid, int end, int[] arr){
        int n = mid+1-start;
        int m = end-mid;

        int[] lArray = new int[n];
        for(int i=0;i<n;++i){
            lArray[i] = arr[i+start];
        }
        
        int[] rArray = new int[m];
        
        for(int j=0;j<m;++j){
            rArray[j] = arr[j+mid+1];
        }

        int i = 0;
        int j = 0;
        int k = start;
        while(i<n && j<m){
            if(lArray[i]<=rArray[j]){
                arr[k] = lArray[i];
                i = i+1;
            }else{
                arr[k] = rArray[j];
                j = j+1;
            }
            k=k+1;
        }

        while(i<n){
            arr[k] = lArray[i];
            k = k+1;
            i = i+1;
        }

        while(j<m){
            arr[k] = rArray[j];
            k = k+1;
            j = j+1;
        }
    }
}