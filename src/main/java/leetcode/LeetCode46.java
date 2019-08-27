package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode46 {

    public List<List<Integer>> permute(int[] nums){
        int len = nums.length;
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        boolean[] used = new boolean[len];
        if(len == 0){
            return  result;
        }

        beginPermute(nums,used,0,len,new Stack<Integer>(),result);
        
        return result;
    }

    private void beginPermute(int[] nums, boolean[] used, int current, int len, Stack<Integer> path, List<List<Integer>> result) {
        if(current == len){
            result.add(new ArrayList<Integer>(path));
            return;
        }

        for (int i = 0; i < len; i++) {
            if(!used[i]){
                path.push(nums[i]);
                used[i] = true;
                beginPermute(nums,used,current+1,len,path,result);
                path.pop();
                used[i]=false;
            }
        }


    }
}
