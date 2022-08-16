
import java.util.*;
public class BinaryTreePreorderTraversal {
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

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        
        if(root == null){
            return list;
        }

        list.add(root.val);
        list.addAll(preorderTraversal(root.right));
        list.addAll(preorderTraversal(root.left));
        
        return list; 
    }
}
