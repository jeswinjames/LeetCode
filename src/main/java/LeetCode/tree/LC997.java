package LeetCode.tree;

public class LC997 {
    public int findJudge(int N, int[][] trust) {
        int judge = - 1;
        int[] trustLevel = new int[N];
        int[] trustReceived = new int[N];
        for(int[] trustRow : trust){
            trustLevel[trustRow[0]-1]++;
            trustReceived[trustRow[1] - 1]++;
        }
        for(int i = 0; i < N; i++){
            if(trustLevel[i] == 0 && trustReceived[i] == N - 1){
                if(judge == - 1){
                    judge = i+1;
                }else {
                    return -1;
                }
            }
        }
        return judge;
    }
}
