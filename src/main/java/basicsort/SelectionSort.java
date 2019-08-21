package basicsort;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = new int[]{7,5,4,2,3,1,9,8,6};
        int n = arr.length;

        while(n > 0){
            int selectMaxPos = selectMaxPos(arr, n);
            int temp = arr[n-1];
            arr[n-1] = arr[selectMaxPos];
            arr[selectMaxPos] = temp;
            n--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }

    public static int selectMaxPos(int[] nums,int n){

        int max = nums[0];
        int maxIndex = 0;
        for (int i = 1; i < n; i++) {

            if(nums[i] > max){
                max = nums[i];
                maxIndex = i;
            }
        }

        return maxIndex;
    }
}
