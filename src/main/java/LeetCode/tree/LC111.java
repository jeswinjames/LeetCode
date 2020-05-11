package LeetCode.tree;

public class LC111 {
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);

        int min = Math.min(leftDepth, rightDepth);
        int res = min == 0 ? Math.max(leftDepth, rightDepth) : min;
        return 1 + res;
    }
}
