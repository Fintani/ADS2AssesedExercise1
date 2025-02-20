public abstract class SortAlg {
    public abstract int[] sort(int[] arr);

    public static void swap(int index1, int index2, int[] arr){
        int holder = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = holder;
    }
}
