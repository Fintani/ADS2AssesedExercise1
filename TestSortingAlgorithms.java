public class TestSortingAlgorithms {

    public static void printArray(int[] arr){
        String str = "";
        for (int i : arr) {
            str = str+i;
        }
        System.out.println(str);
    }

    public static boolean checkSort(int[] arr, SortAlg alg){
        printArray(arr);
        arr = alg.sort(arr);

        // add cutoff to stop long runs

        printArray(arr);

        int length = arr.length;

        for (int i=0; i<length-1; i++){
            if (arr[i]>arr[i+1]){
                System.out.println("Not sorted");
                return false;
            }
        }
        System.out.println("sorted");
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {2,5,3,1,4};
        checkSort(arr, new MergeSort());
    }
}
