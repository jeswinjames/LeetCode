package LeetCode.tree;

import java.util.Stack;

public class LC101 {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode p, TreeNode q){
        if(p == null && q == null){
            return true;
        }else if(p == null || q == null){
            return false;
        }
        if(p.val == q.val){
            return isSymmetric(p.left, q.right) && isSymmetric(p.right, q.left);
        }else {
            return false;
        }
    }

    public boolean isSymmetricIter(TreeNode p, TreeNode q){
        Stack<TreeNode> pStack = new Stack<>();
        Stack<TreeNode> qStack = new Stack<>();
        pStack.push(p);
        qStack.push(q);
        while(!pStack.isEmpty() || !qStack.isEmpty()){
            p = pStack.isEmpty() ? null : pStack.pop();
            q = qStack.isEmpty() ? null :qStack.pop();
            if(p == null && q == null){
                continue;
            }else if(p == null || q == null){
                return false;
            }else  if(p.val == q.val){
                pStack.push(p.left);
                pStack.push(p.right);
                qStack.push(q.right);
                qStack.push(q.left);
            }else {
                return false;
            }
        }
        return true;
    }
}
