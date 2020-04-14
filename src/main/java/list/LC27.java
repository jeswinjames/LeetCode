package list;

public class LC27 {

    private LC27(){}

    public static int removeElement(int[] nums, int val) {
        int leadingPointer = 0;
        int laggingPointer = 0;
        int counter = 0;
        while (leadingPointer < nums.length) {
            if (nums[leadingPointer] == val) {
                leadingPointer++;
            } else {
                if (leadingPointer != laggingPointer) {
                    nums[laggingPointer] = nums[leadingPointer];
                }
                laggingPointer++;
                leadingPointer++;
                counter++;
            }
        }
        return counter;
    }
}
