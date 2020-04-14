package list;

public class LC27 {

    private LC27() {
    }

    public static int removeElement(int[] nums, int val) {
        int leadingPointer = 0;
        int laggingPointer = 0;
        while (leadingPointer < nums.length) {
            if (nums[leadingPointer] != val) {
                nums[laggingPointer] = nums[leadingPointer];
                laggingPointer++;
            }
            leadingPointer++;
        }
        return laggingPointer;
    }
}

