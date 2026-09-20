/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    boolean issame(TreeNode root,TreeNode subroot){
        if(root==null && subroot==null){
            return true;
        }
        if(root==null || subroot == null){
            return false;
        }
        if(root.val!=subroot.val){
            return false;
        }
        return issame(root.left,subroot.left) && issame(root.right,subroot.right);
        }

        boolean issubtree(TreeNode root,TreeNode sub){
            if(root==null) return false;
            if(issame(root,sub)) return true;
            return issubtree(root.left,sub) || issubtree(root.right,sub);
        }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return issubtree(root,subRoot);
    }
}