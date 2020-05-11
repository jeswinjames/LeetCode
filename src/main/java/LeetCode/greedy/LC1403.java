package LeetCode.greedy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LC1403 {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        List<Integer> result = new LinkedList<>();
        int minSum = 0;
        int maxSum = 0;
        for(int i : nums){
            minSum += i;
        }
        int index = nums.length -1;
        while(minSum > maxSum && index >= 0){
            int num = nums[index];
            minSum -= num;
            maxSum += num;
            result.add(num);
            index-- ;
        }
        return result;
    }
}
