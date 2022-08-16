//108. Convert Sorted Array to Binaray Search Tree

public class ConvertSortedArrayToBinarySearchTree {
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

    public TreeNode sortedArrayToBST(int []nums){
        if(nums.length == 0){
            return null;
        }

        return ArraytoBST(nums,0, nums.length-1);
    }

    public TreeNode ArraytoBST(int [] nums, int left, int right){
        if(left>right){
            return null; 
        }
        int mid = left + (right - left) / 2;

        TreeNode node = new TreeNode(nums[mid]);

        node.left = ArraytoBST(nums, left, mid-1);
        node.right = ArraytoBST(nums, mid+1, right);


        return node; 

    }
}
