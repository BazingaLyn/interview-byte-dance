package basicsort;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = new int[]{7,5,4,2,3,1,9,8,6};
        int n = arr.length;
        while(n > 0){
            onceBubble(arr,n);
            n--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void onceBubble(int[] nums,int n){

        int temp;
        for (int i = 0; i < n-1; i++) {
            if( nums[i] > nums[i+1]){
                temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
            }
        }
    }
}
