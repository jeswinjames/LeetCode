package array;

/*
* #hard
* */

public class LC1 {

//    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        boolean even = (nums1.length + nums2.length) % 2 == 0;
//        int medianArrayLength = (nums1.length + nums2.length )/2 + 1;
//
//        if(nums1.length == 0){
//            return getMedian(nums2);
//        }else if(nums2.length == 0){
//            return getMedian(nums1);
//        }
//
//        int start = 0;
//        int end = nums1.length - 1;
//
//    }

    public static double getMedian(int[] nums){
        int length = nums.length;
        if(length % 2 == 0){
            return (nums[length/2] + nums[length/2 - 1])/2.0;
        }else {
            return nums[length/2];
        }
    }
}
