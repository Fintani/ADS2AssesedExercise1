public class ShellSort implements SortAlg{

    public int[] sort(int[] arr){
        int length = arr.length;

        for(int gap=length/2; gap>0; gap=gap/2){
            for(int i=gap; i<length; i++){
                int key = arr[i];

                int j = i;
                while(j>=gap && arr[j-gap]>key){
                    arr[j] = arr[j-gap];
                    j = j-gap;
                }

                arr[j] = key;
            }
        }

        return arr;
    }
}
