package LeetCode.greedy;

public class LC1221 {
    public int balancedStringSplit(String s) {
        int count = 0;
        int balance = 0;
        for(char c : s.toCharArray()){
            switch (c){
                case 'R':
                    balance++;
                    break;
                case 'L':
                    balance--;
                    break;
            }
            if(balance == 0){
                count ++;
            }
        }
        return count;
    }
}
