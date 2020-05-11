package LeetCode.Strings;

public class LC771 {
    public int numJewelsInStones(String J, String S) {
        char[] jewels = J.toCharArray();
        char[] stones = S.toCharArray();
        int count = 0;
        for(int i =0; i < stones.length; i++){
            for(int j = 0; j < jewels.length; i++){
                if(stones[i] == jewels[j]){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
