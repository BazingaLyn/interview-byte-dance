package basicsort;

public class MergeSort {

    public static void main(String[] args) {

        int[] arr = new int[]{7,5,4,2,3,1,9,8,6};
        merge(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void merge(int[] arr,int from,int end){

        if(from >= end){
            return;
        }

        int mid = (from + end) /2;
        merge(arr,from,mid);
        merge(arr,mid+1,end);

        mergeSort(arr,from,mid,end);
    }

    public static void mergeSort(int[] arr,int from ,int mid,int end){

        int[] temps = new int[end-from+1];

        for (int i = from; i <= end; i++) {
            temps[i-from] = arr[i];
        }

        int leftIndex = from;
        int rightIndex = mid+1;

        for (int i = from; i <= end; i++) {

            if(leftIndex >mid){
                arr[i] = temps[rightIndex-from];
                rightIndex++;
            }else if(rightIndex > end){
                arr[i] = temps[leftIndex-from];
                leftIndex++;
            }else if(temps[leftIndex -from] < temps[rightIndex-from]){
                arr[i] = temps[leftIndex-from];
                leftIndex++;
            }else{
                arr[i] = temps[rightIndex-from];
                rightIndex++;
            }
        }

    }


}
