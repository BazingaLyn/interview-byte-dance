package leetcode;

import java.util.Arrays;

public class LeetCode198 {


    /**
     * memo[i] 表示考虑抢劫 nums[i...n] 所能获得的最大收益
     */
    private int[] memo;

    public int rob(int[] nums){
        memo = new int[nums.length];
        Arrays.fill(memo, -1);
        return tryRob(nums, 0);
    }

    private int tryRob(int[] nums, int index) {
        return 1;

    }
}
