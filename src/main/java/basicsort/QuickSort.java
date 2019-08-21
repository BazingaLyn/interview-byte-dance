package basicsort;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = new int[]{7, 5, 4, 2, 3, 1, 9, 8, 6};
        baseQuickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void baseQuickSort(int[] nums, int from, int end) {

        if (from >= end) {
            return;
        }

        int partitionIndex = partition(nums, from, end);

        baseQuickSort(nums, from, partitionIndex - 1);
        baseQuickSort(nums, partitionIndex + 1, end);

    }

    private static int partition(int[] nums, int from, int end) {
        int currentStandard = nums[from];

        int partitionIndex = from;
        int temp;
        for (int i = from + 1; i <= end; i++) {
            if (nums[i] < currentStandard) {
                temp = nums[partitionIndex + 1];
                nums[partitionIndex + 1] = nums[i];
                nums[i] = temp;

                partitionIndex++;
            }


        }
        int tmp = nums[from];
        nums[from] = nums[partitionIndex];
        nums[partitionIndex] = tmp;

        return partitionIndex;

    }
}
