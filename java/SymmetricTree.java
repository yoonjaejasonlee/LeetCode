public class SymmetricTree{
    public class TreeNode{
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

    public boolean isSymmetric(TreeNode root){
        if(root == null){
            return true; 
        }

        return isSymmetric(root.right,root.left);
    }

    public boolean isSymmetric(TreeNode right, TreeNode left){
        if(right == null || left == null){
            return right == left; 
        }

        if(right.val != left.val){
            return false;
        }

        return isSymmetric(right.right,left.left) && isSymmetric(right.left, left.right);
    }
}
}