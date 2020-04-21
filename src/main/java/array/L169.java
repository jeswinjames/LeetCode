package array;

import java.util.Arrays;

public class L169 {

    public static int majorityElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        int count = 1;
        int last = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != last) {
                count = 1;
                last = nums[i];
            } else {
                count++;
            }
            if (count > nums.length / 2) {
                break;
            }
        }

        return last;

    }
}
