package LeetCode.array;

import java.util.Arrays;

public class LC88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] copy = Arrays.copyOf(nums1, m);
        int i = 0;
        int j = 0;
        int counter = 0;

        while(i < m || j < n){
            if(copy[i] < nums2[j] || j >= n){
                nums1[counter] = copy[i];
                i++;
            }else{
                nums1[counter] = copy[j];
                j++;
            }
            counter++;
        }
    }
}
