package basicsort;

public class Quick2Sort {

    public static void main(String[] args) {
        int[] arr = new int[]{7,5,4,2,3,1,9,8,6};
        quickSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void quickSort(int[] nums, int from, int end) {
        if (from >= end) return;

        int partitionIndex = partition(nums, from, end);
        quickSort(nums, from, partitionIndex -1);
        quickSort(nums, partitionIndex + 1, end);
    }

    private static int partition(int[] nums, int from, int end) {

        int currentStandard = nums[from];

        int leftIndex = from + 1;
        int rightIndex = end;

        while (leftIndex < rightIndex) {

            while (nums[leftIndex] < currentStandard && leftIndex <= end) {
                leftIndex++;
            }
            while (nums[rightIndex] > currentStandard && rightIndex >= (from + 1)) {
                rightIndex--;
            }
            if (leftIndex > rightIndex) {
                break;
            }

            if (rightIndex > leftIndex) {
                int temp = nums[leftIndex];
                nums[leftIndex] = nums[rightIndex];
                nums[rightIndex] = temp;
            }
            leftIndex++;
            rightIndex--;

        }

        int temp = nums[from];
        nums[from] = nums[rightIndex];
        nums[rightIndex] = temp;

        return rightIndex;

    }
}
