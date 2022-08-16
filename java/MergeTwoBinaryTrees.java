public class MergeTwoBinaryTrees {
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

    public TreeNode MergeTrees(TreeNode t1, TreeNode t2){
        if(t1 == null && t2 == null){
            return null; 
        }

        if(t1 != null && t2 == null){
            return t1; 
        }

        if(t1 == null && t2 != null){
            return t2; 
        }

        TreeNode tree = new TreeNode(t1.val+t2.val);

        tree.left = MergeTrees(t1.left,t2.left);
        tree.right = MergeTrees(t1.right, t2.right);


        return tree;
        
    }
}
