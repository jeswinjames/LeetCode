package LeetCode.heap;

import java.util.Arrays;

public class LC1046 {
    public int lastStoneWeight(int[] stones) {
        System.out.println("Input:");
        int heapSize = stones.length;
        maxHeapify(stones);
        System.out.println(Arrays.toString(stones));
        while(heapSize > 1){
            System.out.println("Deleting");
            int stone1 = deleteAndGet(stones, heapSize--);
            System.out.println(Arrays.toString(Arrays.copyOf(stones, heapSize)));
            int stone2 = deleteAndGet(stones, heapSize--);
            System.out.println(Arrays.toString(Arrays.copyOf(stones, heapSize)));
            int result = Math.abs(stone1 - stone2);
            if(result > 0){
                System.out.println("Inserting");
                insert(stones, result, heapSize++);
                System.out.println(Arrays.toString(Arrays.copyOf(stones, heapSize)));

            }
        }
        return heapSize == 0 ? 0 : stones[0];
    }

    public int deleteAndGet(int[] array, int heapSize){
        if(array.length == 0 || heapSize == 0){
            return 0;
        }
        int returnVal = array[0];
        int val = array[0] = array[heapSize - 1];
        heapSize--;
        int index = 0;
        while((index + 1)*2 < heapSize || (index + 1) * 2 - 1 < heapSize){
            int right = (index + 1) * 2;
            int left = (index + 1) * 2 - 1;

            int swapIndex;
            if(right >= heapSize || array[right] < array[left]){
                swapIndex = left;
            }else {
                swapIndex = right;
            }
            if(array[swapIndex] > val){
                array[index] = array[swapIndex];
                index = swapIndex;
            }else {
                break;
            }
            array[index] = val;
        }


        return returnVal;
    }

    public void insert(int[] array, int val, int heapSize){
        int index = heapSize;
        while(index != 0 && (((index - 1) / 2) >= 0) && (array[(index - 1) / 2] < val)){
            array[index] = array[(index - 1)/2];
            index = (index - 1)/2;
        }
        array[index] = val;
    }

    public void maxHeapify(int[] array){
        for(int i = array.length/2 - 1; i >=0; i--){
            int j = i;
            int val = array[j];
            while((j + 1)*2 < array.length || (j+1)*2 - 1 < array.length){
                int left = (j+1)*2 - 1;
                int right = (j + 1)*2;

                int swapIndex;
                if(right >= array.length || array[left] > array[right]){
                    swapIndex = left;
                }else {
                    swapIndex = right;
                }

                if(array[swapIndex] > val){
                    array[j] = array[swapIndex];
                    j = swapIndex;
                }else {
                    break;
                }
            }
            array[j] = val;
        }
    }
}
