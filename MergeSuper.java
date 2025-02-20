public abstract class MergeSuper extends SortAlg{

    public abstract int[] sort(int[] arr);

    public void merge(int start, int mid, int end, int[] arr){
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
