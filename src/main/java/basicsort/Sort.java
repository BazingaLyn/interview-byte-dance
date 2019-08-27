package basicsort;

public class Sort {

    public static void main(String[] args) {
        int[] arr = new int[]{7, 5, 4, 2, 3, 1, 9, 8, 6};
        mergeSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void mergeSort(int[] nums){
        mergeSort(nums,0,nums.length-1);
    }

    private static void mergeSort(int[] nums,int from,int end){
        if(from >= end) return;

        int mid = (from + end) /2;
        mergeSort(nums,from,mid);
        mergeSort(nums,mid+1,end);
        merge(nums,from,mid,end);
    }

    private static void merge(int[] nums, int from, int mid, int end) {
        int[] temp = new int[end - from +1];
        for (int i = from; i <=end ; i++) {
            temp[i-from] = nums[i];
        }

        int leftIndex = from;
        int rightIndex = mid+1;

        for (int i = from; i <= end; i++) {
            if(leftIndex > mid){
                nums[i] = temp[rightIndex-from];
                rightIndex++;
            }else if(rightIndex > end){
                nums[i] = temp[leftIndex-from];
                leftIndex++;
            }else if(temp[leftIndex-from] < temp[rightIndex-from]){
                nums[i] = temp[leftIndex-from];
                leftIndex++;
            }else{
                nums[i] = temp[rightIndex -from];
                rightIndex++;
            }

        }
    }


    public static void quickSort(int[] nums) {
        quickSort(nums,0,nums.length-1);
    }

    private static void quickSort(int[] nums, int from, int end) {
        if (from >= end) return;

        int partition = getPartition(nums, from, end);
        quickSort(nums, from, partition - 1);
        quickSort(nums, partition + 1, end);

    }

    private static int getPartition(int[] nums, int from, int end) {

        int p = nums[from];
        int pIndex = from;

        for (int i = from+1; i <= end; i++) {
            if(nums[i] < p){
                int temp = nums[pIndex+1];
                nums[pIndex+1] = nums[i];
                nums[i] = temp;
                pIndex++;
            }
        }

        int temp = nums[from];
        nums[from] = nums[pIndex];
        nums[pIndex]=temp;


        return pIndex;
    }


    public static void insertSort(int[] nums) {
        int temp;
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j > 0; j--) {
                if (nums[j] < nums[j - 1]) {
                    temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }
    }


    public static void selectionSort(int[] nums) {
        int n = nums.length - 1;
        while (n > 0) {
            onceSelect(nums, n);
            n--;
        }
    }

    public static void onceSelect(int[] nums, int n) {
        int max = nums[0];
        int maxIndex = 0;
        for (int i = 0; i <= n; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }

        if (maxIndex != n) {
            int temp = nums[maxIndex];
            nums[maxIndex] = nums[n];
            nums[n] = temp;

        }

    }

    public static void bubbleSort(int[] nums) {
        int n = nums.length - 1;
        while (n > 0) {
            onceBubble(nums, n);
            n--;
        }

    }

    private static void onceBubble(int[] nums, int n) {
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[i + 1]) {
                int temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
            }
        }
    }
}
