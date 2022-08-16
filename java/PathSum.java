/* 112. Path Sum 
   Given the root of a binary tree and a integer targetsum,
   return true if the tree has a path that sums up to targetsum */

public class PathSum {
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

    public boolean pathSum(TreeNode root, int targetSum){
        if(root == null){
            return false;
        }else if(root.left == null & root.right == null && targetSum - root.val == 0){
            return true;
        }else{
            return pathSum(root.right,targetSum - root.val) || pathSum(root.left, targetSum - root.val);
        }
    }
}
