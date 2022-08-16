/* 110. Balanced Binary Tree
Given a binary tree, check if it is height balanced */

public class BalancedBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;      
        }
    }

    public boolean isBalance(TreeNode root){
        if(root == null){
            return true; 
        }

        if(Math.abs(height(root.left)-height(root.right))>1){
            return false; 
        }


        return isBalance(root.left) && isBalance(root.right); 
    }

    public int height(TreeNode node){
        if(node == null){
            return 0;
        }

        return Math.max(height(node.left), height(node.right) +1) ;
    }
}
