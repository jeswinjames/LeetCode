package array;

public class LC53 {
    public static int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int max = nums[0];
        int sum = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(sum < 0){
                sum = nums[i];
            }else {
                sum = sum + nums[i];
            }
            if(sum > max){
                max = sum;
            }
        }
        return sum;
    }

//    private static int recMaxSubArray(int start , int end, int[] nums){
//        if(start == end){
//            return nums[start];
//        }
//
//        int mid  = (start + end)/2;
//
//        int maxLeft = recMaxSubArray(start, mid, nums);
//        int maxRight = recMaxSubArray(mid + 1, end, nums);
//        int maxCrossing = findMaxCrossing(start, end, nums);
//
//        if(maxLeft >= maxRight && maxLeft >= maxCrossing){
//            return maxLeft;
//        }else if(maxRight >= maxLeft && maxRight >= maxCrossing){
//            return maxRight;
//
//        }else {
//            return maxCrossing;
//        }
//
//    }
//
//    private static int findMaxCrossing(int start, int end , int[] nums){
//        int mid = (start + end)/2;
//        int maxSumLeft = nums[mid];
//        int sumLeft = 0;
//        for(int i = mid; i >= start ; i-- ){
//            sumLeft = sumLeft + nums[i];
//            maxSumLeft = sumLeft > maxSumLeft ? sumLeft : maxSumLeft;
//        }
//        int maxSumRight = nums[mid + 1];
//        int sumRight = 0;
//        for(int i = mid + 1; i <= end; i++){
//            sumRight = sumRight + nums[i];
//            maxSumRight = sumRight > maxSumRight ? sumRight : maxSumRight;
//        }
//        return maxSumLeft + maxSumRight;
//    }
}
