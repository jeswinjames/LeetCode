package LeetCode.array;

import java.util.HashMap;
import java.util.Map;

public class LC1218 {
    public static int longestSubsequence(int[] arr, int difference) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(arr[0], 1);
        for(int i = 1; i < arr.length; i++){
            if(map.containsKey(arr[i] - difference)){
                int count = map.get(arr[i] - difference);
                map.remove(arr[i] - difference);
                count++;
                map.put(arr[i],count);
            }else if(!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }
        }
        int max = 1;
        for(int count : map.values()){
            max = count > max ? count : max;
        }
        return max;
    }
}
