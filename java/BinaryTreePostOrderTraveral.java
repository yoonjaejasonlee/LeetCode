
import java.util.*;
public class BinaryTreePostOrderTraveral {
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

     public List<Integer> postOrderTraversal(TreeNode root){
        List<Integer> list = new ArrayList<Integer>();

        if(root == null){
            return list;
        }

        list.addAll(postOrderTraversal(root.left));
        list.addAll(postOrderTraversal(root.right));
        list.add(root.val);


        return list; 
    }
}
