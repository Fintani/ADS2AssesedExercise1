public class TestSortingAlgorithms {

    public boolean checkSort(int[] arr, SortAlg alg){
        System.out.println(arr);

        arr = alg.sort(arr);

        // add cutoff to stop long runs

        System.out.println(arr);

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
}
