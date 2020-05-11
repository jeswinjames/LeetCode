package LeetCode.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LC119
{
    public List<Integer> getRow(int rowIndex) {
        if(rowIndex < 0){
            return Collections.emptyList();
        }
        int[] array = new int[rowIndex + 1];
        for(int i = 0; i < array.length; i++){
            array[i] = ncr(rowIndex, i);
        }
        return (Arrays.stream(array).boxed().collect(Collectors.toList()));
    }

    private int ncr(int n, int r){
        if(r < 0 || r >n ){
            return 0;
        }
        if(n == 0 || r == 0 || n == r){
            return 1;
        }
        else return ncr(n-1, r) + ncr(n-1, r-1);
    }
}
