import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class TestSortingAlgorithms extends Thread{

    public static void printArray(int[] arr){
        String str = "";
        for (int i : arr) {
            str = str+i+",";
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

    public static int countFileLines(File file) throws FileNotFoundException{
        int lines = 0;
        Scanner reader = new Scanner(file);
        while(reader.hasNextLine()){
            if(reader.nextLine() != null){
                lines = lines+1;
            }
        }
        reader.close();
        return lines;
    }

    public static int[] fileToArray(String file) throws FileNotFoundException{
        File arrayFile = new File(file);
        int[] arr = new int[countFileLines(arrayFile)];
        int i = 0;
        Scanner reader = new Scanner(arrayFile);
        while(reader.hasNextLine()){
            int num = Integer.valueOf(reader.nextLine());
            arr[i] = num;
            i = i+1;
        }
        reader.close();

        return arr;
    }

    public static long timeAlg(String file, SortAlg alg){
        try{
            int[] arr = fileToArray(file);
            long startTime = System.nanoTime();
            alg.sort(arr);
            long endTime = System.nanoTime();
            long duration = (endTime-startTime);
            System.out.println(file+" sorted in: "+duration+"ns");
            return duration;
        } catch(Exception exception){
            System.out.println(exception);
            return 0;
        }
    }
    
    public void run(){
        timeAlg("Data/bad.txt", new QuickInsertionSort());
    }
    public static void main(String[] args) {
        try{
            TestSortingAlgorithms t = new TestSortingAlgorithms();
            t.start();
            t.join(30000);

            if(t.isAlive()){
                System.out.println("Over 300 seconds, DNF");
                t.interrupt();
            }
        } catch (Exception exception){
            System.out.println(exception);
        }
    }
}
