public class BottomUpMerge extends MergeSuper{
    
    public int[] sort(int[] arr){
        int length = arr.length;
        int arrEnd = length-1;

        for(int size=1;size<length;size=size*2){
            for(int start=0;start<arrEnd;start=start+size*2){
                int mid = Math.min(start+size-1,arrEnd);
                int end = Math.min(start+(size*2)-1, arrEnd);
                merge(start, mid, end, arr);
            }
        }

        return arr;
    }
}
