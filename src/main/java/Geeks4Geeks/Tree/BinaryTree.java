package Geeks4Geeks.Tree;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
    public static void preorderRecursive(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorderRecursive(root.left);
        preorderRecursive(root.right);
    }

    public static void preorderIterative(Node root){
        if(root == null){
            return;
        }
        Stack<Node> preOrderStack = new Stack<>();
        preOrderStack.push(root);
        while(!preOrderStack.empty()){
            Node node = preOrderStack.pop();
            if(node.right != null){
                preOrderStack.push(node.right);
            }
            if(node.left != null){
                preOrderStack.push(node.left);
            }
            System.out.println(node.data + " ");
        }
    }

    public static void inOrderRecursive(Node root){
        if(root == null){
            return;
        }
        inOrderRecursive(root.left);
        System.out.print(root.data + " ");
        inOrderRecursive(root.right);
    }

    public static void inOrderIterative(Node root){
        Stack<Node> inOrderStack = new Stack<>();
        while(root!= null || !inOrderStack.isEmpty()){
            if(root == null){
                Node top = inOrderStack.pop();
                System.out.print(top.data + " ");
                root = top.right;
            }
            inOrderStack.push(root);
            root = root.left;
        }
    }

    public static void levelOrder(Node node)
    {
        if(node == null){
            return;
        }
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(node);
        while (!queue.isEmpty()){
            Node top = queue.poll();
            System.out.print(top.data + " ");
            if(top.left != null){
                queue.add(top.left);
            }
            if(top.right != null){
                queue.add(top.right);
            }
        }
    }

    public static void levelLineByLine(Node node){
        Queue<Node> firstLine = new ArrayDeque<>();
        Queue<Node> secondLine = new ArrayDeque<>();
        firstLine.add(node);
        while(!firstLine.isEmpty()){
            node = firstLine.poll();
            System.out.print(node.data + " ");
            if(node.left != null){
                secondLine.add(node.left);
            }
            if (node.right != null){
                secondLine.add(node.right);
            }
            if(firstLine.isEmpty()){
                System.out.println("");
                firstLine.addAll(secondLine);
                secondLine.clear();
            }
        }
    }

    public static int height(Node node)
    {
        if(node == null){
            return 0;
        }
        return  1 + Math.max(height(node.left), height(node.right));
    }

    public static boolean isIdentical(Node root1, Node root2)
    {
        if(root1 == null || root2 == null){
            return root1 == root2;
        }else if(root1.data != root2.data){
            return false;
        }
        return isIdentical(root1.left , root2.left) && isIdentical(root1.right, root2.right);
    }

    public static int isSumProperty(Node node)
    {
        if(node == null){
            return 1;
        }

        int leftVal = node.left == null ? 0 : node.left.data;
        int rightVal = node.right == null ? 0 : node.right.data;

        if(node.data != leftVal + rightVal){
            return 0;
        }

        return isSumProperty(node.left) == 1 && isSumProperty(node.right) == 1 ? 1 : 0;

    }

    public static void printSpiral(Node root)
    {
        
    }

}
