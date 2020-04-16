package list;

public class LC35 {
    public static int searchInsert(int[] nums, int target) {
        if(nums.length == 0) return 0;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(start == end){
                if(target < nums[start]){
                    return start;
                }else {
                    return start + 1;
                }
            }
            if(nums[mid] < target){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return 0;
    }

}
