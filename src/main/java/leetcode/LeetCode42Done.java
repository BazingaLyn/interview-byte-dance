package leetcode;

public class LeetCode42Done {

    public int trap(int[] height) {
        int sum = 0;
        int max = getMax(height);
        for (int i = 1; i <= max; i++) {

            //碰到墙就表示结束，开始累加
            boolean isStart = false;
            int temp_sum = 0;
            for (int j = 0; j < height.length; j++) {
                if(height[i] >= i){
                    sum = sum + temp_sum;
                    temp_sum = 0;
                    isStart = true;
                }
                if(isStart&& height[j] < i){
                    temp_sum++;
                }

            }
        }
        return sum;
    }


    private int getMax(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            if (height[i] > max) {
                max = height[i];
            }
        }
        return max;
    }


}
